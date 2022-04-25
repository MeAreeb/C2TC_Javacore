package com.tns.client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;

public class Client
{
public static void main(String[] agrs)
{
	//step a
	MMBankFactory mmfactory=new MMBankFactory();
	mmfactory.getNewSavingAccount(111, "Areeb", 1000, true);
	mmfactory.getNewCurrentAccount(123, "abc", 4567, 50);
	
	
	//step b
	MMSavingAcc mmSavingAcc = new MMSavingAcc(0, null, 1000, false);
	MMSavingAcc mmsaving=mmSavingAcc;
	mmsaving.getaccBal();
	mmsaving.getaccNm();
	mmsaving.getaccBal();
	mmsaving.withdraw(1000);
	mmsaving.toString();
	

	MMCurrentAcc mmcurrent=new MMCurrentAcc(123, "areeb", 4567, 50);
	mmcurrent.getaccBal();
	mmcurrent.getaccNm();
	mmcurrent.getaccBal();
	mmcurrent.getCreditLimit();
	
	mmcurrent.withdraw(1000);
	mmcurrent.toString();
	
}
	

}