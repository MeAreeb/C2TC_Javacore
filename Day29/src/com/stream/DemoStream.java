package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

	public static void main(String[] args) {
		
     ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(0);
      al.add(5);
      al.add(10);
      al.add(15);
System.out.println(al);
List<Integer> ll=al.stream().filter(i->i%2==0).collect(Collectors.toList());
           System.out.print(ll);
	}

}
