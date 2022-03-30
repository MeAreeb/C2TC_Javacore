package collection;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		{
			Set<Integer> hs=new HashSet<Integer>();
			hs.add(10);
			hs.add(20);
			hs.add(57);
			System.out.println(hs);
			hs.add(null);
			hs.add(20);
			hs.add(50);
			System.out.println(hs);
			}


	}

}
