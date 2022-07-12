package com.study.ocp.day16;

public class ATM {

	public static void main(String[] args) {
		 Account account= new Account(100000);
		 System.out.printf("帳戶餘額 $%,d\n",account.getBalance());
		 System.out.println("提款..");
		 Thread t1 =new Thread (new Withdraw(account, 50000),"小明");//小明去提款 $5000
		 Thread t2 =new Thread (new Withdraw(account, 40000),"小華");//小明去提款 $4000
		 Thread t3 =new Thread (new Withdraw(account, 30000),"小英");//小明去提款 $3000
		 //開始存款作業
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 StringBuilder s1; //Non -Thread-safe(單工用,只在某一分法中 )
		 StringBuffer s2; //Thread-Safe(多執行緒用,建立物件變數)
	}

}
