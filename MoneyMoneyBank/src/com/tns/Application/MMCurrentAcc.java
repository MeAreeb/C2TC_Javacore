package com.tns.Application;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

public MMCurrentAcc(int accNo, String accNm, float accBal, int i) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

public void withdeaw(float accBal) 
{
	System.out.println("Dear account holder,your balance is  "+accBal+" your credit limit is " +creditLimit);
}

@Override
public String toString() {
	return "MMCurrentAcc [creditLimit=" + getCreditLimit() + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}



}
