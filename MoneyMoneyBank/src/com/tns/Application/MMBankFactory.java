package com.tns.Application;

import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class MMBankFactory extends BankFactory
{
	
	public  MMSavingAcc getNewSavingAccount() {
		return null;
	}
	public MMCurrentAcc getNewCurrentAccount() {
		return null;
	}
	@Override
	public SavingAcc getNewSavingAccount(final int accNo, final String accNm, final float accBal, final boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float isSalary) {
		// TODO Auto-generated method stub
		return null;
	}
}
