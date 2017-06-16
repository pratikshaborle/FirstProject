package com.recommend;



public class Test { 
	public void testStock() { 
		
		Stock symb = StockFetcher.getStock("GOOG");
		System.out.println("Price: " + symb.getPrice());
		System.out.println("Volume: " + symb.getVolume()); 
		System.out.println("P/E: " + symb.getPe());
		System.out.println("EPS: " + symb.getEps());
		System.out.println("Year Low: " + symb.getWeek52low());
		System.out.println("Year High: " + symb.getWeek52high());
		System.out.println("Day Low: " + symb.getDaylow());
		System.out.println("Day High: " + symb.getDayhigh());
		System.out.println("50 Day Moving Av: " + symb.getMovingav50day());
		System.out.println("Market Cap: " + symb.getMarketcap());
		System.out.println("The full name is: " + symb.getName());
		System.out.println("The currency is: " + symb.getCurrency());
		System.out.println("The percentage change is: " + symb.getperchange());
		System.out.println("The previous close was: " + symb.getPreviousClose());
		System.out.println("The open for today was: " + symb.getOpen());
		System.out.println("The exchange is " + symb.getExchange());
		
	} 
public static void main(String[] args){
    
Test t=new Test();
t.testStock();
	

}
}
