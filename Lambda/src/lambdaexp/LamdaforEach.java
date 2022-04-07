package lambdaexp;

import java.util.LinkedList;

public class LamdaforEach {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Areeb");
		ll.add("Abdul Aziz");
		ll.add("Maaz");
		ll.add("Zaid");
		ll.forEach((n)->{System.out.println(n);});

	}

}
