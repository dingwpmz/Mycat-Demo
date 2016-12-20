package persistent.prestige.study.dubbox.pre;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * NioServer学习
 * 
 * @author dingwei2
 *
 */
public class NioServer {

	private int port;
	private ServerSocketChannel socketChannel;
	private Selector selector;
	private volatile boolean runing = true;
	private ServerSocket socket;

	/**
	 * 业务执行
	 */
	private ExecutorService businessThreadPool = Executors.newFixedThreadPool(5);

	/**
	 * 服务器，连接
	 * 
	 * @author dingwei2
	 *
	 */
	private class ConnectionThread implements Runnable {

		public ConnectionThread() {
			try {

				port = 9999;
				socketChannel = ServerSocketChannel.open();
				selector = Selector.open();
				ServerSocket socket = socketChannel.socket();
				socket.bind(new InetSocketAddress("127.0.0.1", port));
				socketChannel.configureBlocking(false);
				socketChannel.register(selector, SelectionKey.OP_ACCEPT);// 注册连接监听事件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (runing) {
				try {
					selector.select();
				} catch (IOException e) {
					e.printStackTrace();
				}

				Set<SelectionKey> keys = selector.selectedKeys();

				for (SelectionKey key : keys) {
					if (key.isAcceptable()) {
						if (key.isAcceptable()) {
							doConnect(key);
						} else if (key.isReadable()) { // 从客户端读，请求
							doRequest(key);
						} else if (key.isWritable()) {
							doResponse(key);
						}
					}
				}

			}
		}

		/**
		 * 处理连接请求
		 * 
		 * @param key
		 */
		private void doConnect(SelectionKey key) {
			SocketChannel client = null;
			ServerSocketChannel server = (ServerSocketChannel) key.channel();
			try {
				client = server.accept();
				if (client == null)
					return;

				client.configureBlocking(false);
				client.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
			} catch (IOException e) {
				try {
					client.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		/**
		 * 从客户端读取请求信息，并进行处理
		 * 
		 * @param key
		 */
		private void doRequest(SelectionKey key) {
			ByteBuffer reciveBuffer = null;
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			SocketChannel socketChannel = (SocketChannel) key.channel();
			int readBytes = 0;
			try {
				readBytes = socketChannel.read(byteBuffer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			byteBuffer.flip();
			if (readBytes > 0) {
				reciveBuffer = ByteBuffer.allocate(readBytes);
				byteBuffer.get(reciveBuffer.array());
				reciveBuffer.flip();
			}
			// 然后读取客户端的请求信息
			String executeInfo = parseRequestAndResponse(reciveBuffer);

			// 将执行任务，转入到 业务线程池中执行
			businessThreadPool.submit(new Worker(socketChannel, executeInfo));
		}

		/**
		 * 做个简单协议解析
		 * 
		 * @param requestBuffer
		 */
		private String parseRequestAndResponse(ByteBuffer requestBuffer) {
			// 实现如下的协议，一个请求 uid:method:{params}
			String requestTxt = "";
			try {
				requestTxt = new String(requestBuffer.array(), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return requestTxt;

		}

		/**
		 * 从服务端向客户端写请求结果信息
		 * 
		 * @param key
		 */
		private void doResponse(SelectionKey key) {

		}

	}

	private class Worker implements Runnable {

		private SocketChannel sockChannel;
		private String executeInfo;// 执行信息

		public Worker(SocketChannel sockChannel, String executeInfo) {
			super();
			this.sockChannel = sockChannel;
			this.executeInfo = executeInfo;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			// 做业务处理，然后输出结果，这里，只输出结果
			System.out.println("开始执行" + executeInfo + "..........");
			String result = executeInfo + ":ok";
			ByteBuffer buffer = ByteBuffer.wrap(result.getBytes());
			try {
				sockChannel.write(buffer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
