package application;

import com.tns.Framwork.ShopFactory;
import com.tns.Framwork.PrimeAcc;
import com.tns.Framwork.NormalAcc;

public class GSShopFactory implements ShopFactory
{
	public GSPrimeAcc getNewPrimeAccount(int accNo,String accNm, float charges,boolean b)
	{
		
	GSPrimeAcc gsprime=new GSPrimeAcc(accNo, accNm, charges, b);
		return gsprime;
		
		
	}
	public GSNormalAcc getNewNormalAccount(int accNo,String accNm, float charges,float deliverycharges)
	{
		GSNormalAcc gsnormal=new GSNormalAcc(accNo, accNm, charges, deliverycharges);
		return gsnormal;
		
		
	}
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
}
