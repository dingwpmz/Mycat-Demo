package persistent.prestige.framework.curator.lock;


import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class DistributedLock {
	
	public static CuratorFramework client;
	
	private InterProcessLock interProcessLock;
	
	
	
	static {
		client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", 60000, 10000, new ExponentialBackoffRetry(1000, 3));
		client.start();
		
		
	}
	
	
	public DistributedLock(String path) {
		interProcessLock = new InterProcessMutex(client, path);
	}
	
	

	public void lock() {
		// TODO Auto-generated method stub
		try {
			interProcessLock.acquire();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("获取分布式锁异常", e);
		}
	}
	
	public void unlock() {
		// TODO Auto-generated method stub
		try {
			interProcessLock.release();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("释放分布式锁异常", e);
		}
		
	}


}
