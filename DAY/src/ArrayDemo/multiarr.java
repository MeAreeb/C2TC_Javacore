package ArrayDemo;

public class multiarr {

	public multiarr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiarr1[] []= new int [3][3];
        int multiarr [][]= {{2,7,9},{3,6,1},{7,4,2}};
        multiarr1[0] =new int[3];
        multiarr1[1] =new int[3];
        multiarr1[2] =new int[3];
        for(int i=0; i<3; i++)
        {
        	for(int j=0; j<3; j++)
        	{
        		System.out.println(multiarr[i][j]);
        	}
        	  System.out.println();
        }
        
   }

}
