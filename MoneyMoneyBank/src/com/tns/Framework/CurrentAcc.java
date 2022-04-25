package com.tns.Framework;

public abstract class CurrentAcc extends BankAcc
{
	protected float creditLimit;
	
    public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}



public void withdraw(float accBal) 
{
	
}

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + getCreditLimit() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

public float getCreditLimit() {
	return creditLimit;
}

public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
}


}
