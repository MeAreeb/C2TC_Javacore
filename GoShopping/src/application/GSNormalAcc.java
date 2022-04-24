package application;

import com.tns.Framwork.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Chargesare "+charges+" with delivery charges" +deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void getdeliverycharges() {
		// TODO Auto-generated method stub
		
	}
	
}
