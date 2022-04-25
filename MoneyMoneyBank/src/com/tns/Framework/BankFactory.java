package com.tns.Framework;

public abstract class BankFactory 
{
public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float isSalary);
public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean b) {
	// TODO Auto-generated method stub
	return null;
}
}
