package com.study.ocp.day16;

public class Father extends Thread {
	
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		
		Worker worker =new Worker();
		worker.start();
		
		try {
				worker.join(10_000);//join可以設定最大容許時間 join(毫秒)
				/*Thread.sleep(10_000); 
				 * 要了解join跟sleep的差異,sleep會等到完畢才會工作
				 */
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//測試
	public static void main(String[]  args) {
		new Father().start();
	}
}
