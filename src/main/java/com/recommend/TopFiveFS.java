package com.recommend;
import java.util.*;
public class TopFiveFS {
//for sector Information Technology
	public void testFS() { 
		
		Stock symb = StockFetcher.getStock("AXISBANK");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("BANKBARODA");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("HDFCBANK");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("ICICIBANK");
		System.out.println("The percentage change is: " + symb3.getperchange());
		
		Stock symb4 = StockFetcher.getStock("INDUSINDBK");
		System.out.println("The percentage change is: " + symb4.getperchange());

		Stock symb5 = StockFetcher.getStock("KOTAKBANK");
		System.out.println("The percentage change is: " + symb5.getperchange());
		
		Stock symb6 = StockFetcher.getStock("PNB");
		System.out.println("The percentage change is: " + symb6.getperchange());

		Stock symb7 = StockFetcher.getStock("SBIN");
		System.out.println("The percentage change is: " + symb7.getperchange());
		
		Stock symb8 = StockFetcher.getStock("YESBANK");
		System.out.println("The percentage change is: " + symb8.getperchange());


		PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange(),symb4.getperchange(),symb5.getperchange(),symb6.getperchange(), symb7.getperchange(),symb8.getperchange()};

		
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
    
TopFiveFS t=new TopFiveFS();
t.testFS();	

}
}
