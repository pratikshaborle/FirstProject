package com.recommend;
import java.util.*;
public class TopFiveEn {
//for sector Information Technology
	public void testEn() { 
		
		Stock symb = StockFetcher.getStock("BPCL");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("GAIL");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("NTPC");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("ONGC");
		System.out.println("The percentage change is: " + symb3.getperchange());
		
		Stock symb4 = StockFetcher.getStock("POWERGRID");
		System.out.println("The percentage change is: " + symb4.getperchange());

		Stock symb5 = StockFetcher.getStock("RELIANCE");
		System.out.println("The percentage change is: " + symb5.getperchange());
		
		Stock symb6 = StockFetcher.getStock("TATAPOWER");
		System.out.println("The percentage change is: " + symb6.getperchange());

		PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange(),symb4.getperchange(), symb5.getperchange(),symb6.getperchange()};

		
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
    
TopFiveEn t=new TopFiveEn();
t.testEn();	

}
}
