package com.recommend;
import java.util.*;
public class TopFiveM {
//for sector Information Technology
	public void testM() { 
		
		Stock symb = StockFetcher.getStock("COALINDIA");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("HINDALCO");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("VEDL");
		System.out.println("The percentage change is: " + symb2.getperchange());

		PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange()};

		
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
    
TopFiveM t=new TopFiveM();
t.testM();	

}
}
