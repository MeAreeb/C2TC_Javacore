package com.tns.client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;

public class Client
{
public static void main(String[] agrs)
{
	//step a
	GSShopFactory gssfactory=new GSShopFactory();
	gssfactory.getNewPrimeAccount(111, "Areeb", 1000, true);
	gssfactory.getNewNormalAccount(123, "abc", 4567, 50);
	
	
	//step b
	GSPrimeAcc gsprime=new GSPrimeAcc(0, null, 1000, false);
	gsprime.getAccNo();
	gsprime.getAccNm();
	gsprime.getCharges();
	gsprime.bookProduct(1000);
	gsprime.toString();
	

	GSNormalAcc gsNormal=new GSNormalAcc(123, "areeb", 4567, 50);
	gsNormal.getAccNo();
	gsNormal.getAccNm();
	gsNormal.getCharges();
	gsNormal.getdeliverycharges();
	
	gsNormal.bookProduct(1000);
	gsNormal.toString();
	
}
	

}
