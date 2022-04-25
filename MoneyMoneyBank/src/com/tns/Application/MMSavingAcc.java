package com.tns.Application;

import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float accBal=0;
	
public MMSavingAcc(int accNo, String accNm, float accBal, boolean b) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

public void withdraw(float accBal)
{
	System.out.println("Dear account holder, your balance is "+accBal);	
}

@Override
public String toString() {
	return "MMSavingAcc [isSalary=" + isSalary() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
