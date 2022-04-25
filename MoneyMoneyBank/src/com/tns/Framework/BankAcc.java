package com.tns.Framework;

public abstract class BankAcc {
	
	protected int accNo;
	protected String accNm;
	protected float accBal;
	
	public int getaccNo() {
		return accNo;
	}
	public void setaccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getaccNm() {
		return accNm;
	}
	public void setaccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getaccBal() {
		return accBal;
	}
	public void setaccBal(float charges) {
		this.accBal = charges;
	}

	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal) 
	{
		
	}
	public void deposite(float accBal) 
	{
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
