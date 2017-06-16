package com.recommend;
import java.util.*;
public class TopFiveIT {
//for sector Information Technology
	public void testIT() { 
		
		Stock symb = StockFetcher.getStock("HCLTECH");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("TCS");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("INFY");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("TECHM");
		System.out.println("The percentage change is: " + symb3.getperchange());
		
		Stock symb4 = StockFetcher.getStock("WIPRO");
		System.out.println("The percentage change is: " + symb4.getperchange());

		PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange(),symb4.getperchange()};

		
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
    
TopFiveIT t=new TopFiveIT();
t.testIT();	

}
}
