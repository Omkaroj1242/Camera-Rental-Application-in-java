package com.camerarental.wallet;

public class MyWallet {
	private int myBalance = 20000;
	
	public void creditAmount(float amt) {
		myBalance += amt;
	}
	
	public void debitAmount(float amt) {
		myBalance -= amt;
	}

	public int getMyBalance() {
		return myBalance;
	}	
	
}
