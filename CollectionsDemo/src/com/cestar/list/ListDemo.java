package com.cestar.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> list = new ArrayList<>();
		
		
		
		list.add("Milk");
		
		list.add("Eggs");
		
		list.add("Salt");
		
		list.add("Cookies");
		
		list.add("Sugar") ;
		
		list.add("Cookies");
		
		System.out.println("==========================Using ForEcah Loop (List) ====================");
		
		for(String  item:        list) {
			
			System.out.print(item+"   ");
			
			
		}
		
		System.out.println();
		System.out.println("==========================Using Iterator (List) ====================");
		
		Iterator   iter = list.iterator();
		
		
		while(iter.hasNext()) {
			
			System.out.print(iter.next()+"  ");
		}
		
		
		System.out.println();
		System.out.println("==========================For Loop (List) ====================");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.toArray()[i]+"  ");
			
		}
		
		
		
		
		
		
		
		
		
		List<Integer>      prices = new ArrayList<>();
		
		
		
		

	}

}
