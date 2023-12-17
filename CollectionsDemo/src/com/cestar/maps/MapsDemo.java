package com.cestar.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String>    map = new TreeMap<>();
		
		
		map.put(111, "Erick") ;
		
		map.put(222, "John");
		
		map.put(333, "Alex");
		
		map.put(444, "Steve");
		
		System.out.println("====================Using Lambda Expression -> (Map)====================");
		
		map.forEach((Key,Value)->{
			
			System.out.println("Employees ID :"+Key+"    Employees Name :"+Value);
		});
		
		System.out.println("======================Using ForEach Loop====================");
		
		
	     Set<Integer>   keySet = map.keySet();
	     
	     
	     for(Integer    key:        keySet) {
	    	 
	    	 System.out.println("Employee's Id    "+key+ "   Employee Name :      "+map.get(key));
	    	 
	     }
	     
	     System.out.println("======================Using ForEach Loop (map.ketSey() inside the loop)====================");
	     
	     for(Integer  key:       map.keySet()) {
	    	
	    	 System.out.println("Employee's Id    "+key+ "   Employee Name :      "+map.get(key));
	    	 
	     }
	     
	     
	     System.out.println("======================Using Map.Entry on entrySet() ====================");
	     
	       for(Map.Entry<Integer,String>    entry:                  map.entrySet()) {
	    	   
	    	   System.out.println("Employees ID : "+entry.getKey()+"  Employee Name : "+entry.getValue());
	    	   
	       }
		
	    	 
	    	 
	    	 
	     }
	     
	   
	     
	     
//	     for(Integer key:  keySet) {
//	    	 
//	    	 String value = students.get(key);
//	    	 
//	    	 System.out.println(key +"   "+value);
//	    	 
//	     }
		
		
		
		

	}


