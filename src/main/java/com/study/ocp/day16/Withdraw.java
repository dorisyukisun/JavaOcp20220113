package com.study.ocp.day16;

public class Withdraw implements Runnable{
	
	private Account account;
	private int money;
	//不能寫死 account 不能new  要從外面入資料進來
	public Withdraw(Account account,int money) {
		//得到指定帳戶與款項金額
		this.account= account;
		this.money=money;
	}
	
	@Override
	public void run() {
		 //盡情提款
		account.withdraw(money);
		
	}

}
