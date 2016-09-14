package persistent.prestige.framework.curator.lock;

import java.util.concurrent.CountDownLatch;


public class LockTest {
	
	private static Integer THREAD_COUNT = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testSafe();
		

	}
	
	
	
	/**
	 * 测试安全的自增操作
	 */
	public static void testSafe() {
		Integer cur = new Integer(0);
		IntegerMapper c = new IntegerMapper(cur);
		
		CountDownLatch cdl = new CountDownLatch(THREAD_COUNT);
		
		DistributedLock lock = new DistributedLock("/zk/agilelock");
		for(int i = 0; i < THREAD_COUNT; i ++ ) {
			Thread t = new Thread(new EvalCountSafe(c, lock, cdl));
			t.start();
			
		}
		
		try {
			cdl.await();
			System.out.println("最终值:" + c.cur.intValue());
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.client.close();
		}
		
		
		
	}

}
