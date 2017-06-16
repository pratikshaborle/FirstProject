package com.recommend;
import java.util.*;
public class TopFiveTel {
//for sector Information Technology
	public void testTel() { 
		
		Stock symb = StockFetcher.getStock("IDEA");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("BHARTIARTL");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		PriorityQueue<Double> p = new PriorityQueue<Double>(5);

		double[] a = new double[]{symb.getperchange(),symb1.getperchange()};

		
		for (double i : a){
		    p.add(i);
		}
		  			p.remove();
					System.out.println("5th Stock: "+p.poll());
				      
					System.out.println("4th Stock: " + p.poll());
			      
			        System.out.println("3rd Stock: " + p.poll());
			      
			        System.out.println("2nd Stock: " + p.poll());
			       
			        System.out.println("1st Stock: " + p.poll());
	
	} 
public static void main(String[] args){
    
TopFiveTel t=new TopFiveTel();
t.testTel();	

}
}
