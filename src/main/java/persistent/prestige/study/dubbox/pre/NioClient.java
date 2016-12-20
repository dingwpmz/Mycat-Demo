package persistent.prestige.study.dubbox.pre;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class NioClient {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 9999);
			socketChannel.configureBlocking(false);
			
		} catch (Throwable e) {
			
		}

	}
	
	
	private class Request implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
