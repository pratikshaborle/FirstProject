package com.recommend;
import java.util.*;
public class TopFivePh {
//for sector Information Technology
	public void testPh() { 
		
		Stock symb = StockFetcher.getStock("CIPLA");
		System.out.println("The percentage change is: " + symb.getperchange());

		Stock symb1 = StockFetcher.getStock("DRREDDY");
		System.out.println("The percentage change is: " + symb1.getperchange());
		
		Stock symb2 = StockFetcher.getStock("LUPIN");
		System.out.println("The percentage change is: " + symb2.getperchange());

		Stock symb3 = StockFetcher.getStock("SUNPHARMA");
		System.out.println("The percentage change is: " + symb3.getperchange());
		
		PriorityQueue<Double> p = new PriorityQueue<Double>(5);

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange()};

		
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
    
TopFivePh t=new TopFivePh();
t.testPh();	

}
}
