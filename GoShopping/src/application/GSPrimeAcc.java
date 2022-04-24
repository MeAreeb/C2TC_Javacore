package application;

import com.tns.Framwork.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float charges=0;
public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}


	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Chargesare "+charges);
	}


	@Override
	public String toString() {
		return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
