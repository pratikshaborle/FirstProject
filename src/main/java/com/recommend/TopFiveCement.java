package com.recommend;
import java.util.*;
public class TopFiveCement {
//for sector Information Technology
	public void testCem() { 
		
		Stock symb = StockFetcher.getStock("ACC");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("AMBUJACEM");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("ULTRATECH");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("GRASIM");
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
    
TopFiveCement t=new TopFiveCement();
t.testCem();	

}
}
