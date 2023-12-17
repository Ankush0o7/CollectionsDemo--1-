package com.cestar.stack;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String>  books =  new Stack<>();
		
		
	
		
		Stack<String>  books2 = new Stack<>();
		
		books2.push("Java") ;
		
		books2.push("C Sharp");
		
		books2.push("Python");
		
		books2.push("Oracle");
		
		books2.push("SQL");
		
		books2.add("Golang");
		
		
		books2.pop();
		
		System.out.println(books2);
		
		
		
        System.out.println();
		
		System.out.println("==========================Using ForEach Loop -> ====================");
		
		for(String   book:    books2) {
			
			
			
			System.out.print(book+"  ");
		}
		
		
		
		

	}

}
