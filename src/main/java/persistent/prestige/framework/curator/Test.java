package persistent.prestige.framework.curator;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.zookeeper.CreateMode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String zookeeperUrl = "127.0.0.1:2181";
		
		CuratorFramework client = null;
		
		try {
			
			client = CuratorFrameworkFactory.builder().connectString(zookeeperUrl)
					.retryPolicy(new RetryOneTime(1000))
					.build();
			
			client.start();
			
			System.out.println(client.getData().forPath("/zk/curator"));
			
			
            String ourPath = client.create()
            		.creatingParentContainersIfNeeded().withProtection().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/zk/curator/testA", "test".getBytes());

			
         //   String ourPath2 = client.create().creatingParentContainersIfNeeded().withProtection().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/zk/curator/testA", "test".getBytes());

            
            System.out.println("ourPath:" + ourPath);
      //      System.out.println("ourPath2:" + ourPath2);
			
			System.out.println("业务方法运行完毕,,等待20S关闭CuratorFramework");
			Thread.sleep(20000);
		} catch (Throwable e) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			if(client != null) {
				client.close();
			}
		}
		
		
		System.out.println("运行完毕");
		
		
		

	}

}
