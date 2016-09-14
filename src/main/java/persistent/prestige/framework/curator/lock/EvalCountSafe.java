package persistent.prestige.framework.curator.lock;

import java.util.concurrent.CountDownLatch;


public class EvalCountSafe implements Runnable {

	IntegerMapper cur;
	DistributedLock lock;
	CountDownLatch cdl;
	
	public EvalCountSafe(IntegerMapper cur, DistributedLock lock, CountDownLatch cdl) {
		this.cur = cur;
		this.lock = lock;
		this.cdl = cdl;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			lock.lock();
			for(int i = 0; i < 10000; i ++ ) {
				this.cur.cur ++;
			}
		} finally {
			lock.unlock();
			cdl.countDown();
		}
		
		
	}

}
