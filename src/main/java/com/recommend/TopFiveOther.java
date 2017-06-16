package com.recommend;
import java.util.*;
public class TopFiveOther {
//for sector Information Technology
	public void testOth() { 
		
		Stock symb = StockFetcher.getStock("LT");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("BHEL");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("ZEEL");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("ADANIPORTS");
		System.out.println("The percentage change is: " + symb3.getperchange());
		
		PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange()};

		
		for (double i : a){
		    p.add(i);
		}
		System.out.println("1st Stock: " + p.poll());
		
		System.out.println("2nd Stock: " + p.poll());
		 
		System.out.println("3rd Stock: " + p.poll());
		
		System.out.println("4th Stock: " + p.poll());
      
		System.out.println("5th Stock: " + p.poll());
	      
	
	} 
public static void main(String[] args){
    
TopFiveOther t=new TopFiveOther();
t.testOth();	

}
}
