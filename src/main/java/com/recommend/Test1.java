package com.recommend;
import java.io.*;

import java.util.Collections;
import java.util.PriorityQueue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Test1 extends HttpServlet{
	

public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
       
        Stock symb = StockFetcher.getStock("LT");

		Stock symb1 = StockFetcher.getStock("BHEL");
		
		Stock symb2 = StockFetcher.getStock("ZEEL");
		
		Stock symb3 = StockFetcher.getStock("ADANIPORTS");
		
        PriorityQueue<Double> p = new PriorityQueue<Double>(5,Collections.reverseOrder());

		double[] a = new double[]{symb.getperchange(),symb1.getperchange(),symb2.getperchange(), symb3.getperchange()};

		
		for (double i : a){
		    p.add(i);
		}
        try {
            BufferedWriter in = new BufferedWriter(new FileWriter("dashboard.html"));
            in.write("<html><body><table>"); //Here you pass your output
            in.write("<tr><td>");
            in.write("1st Stock: " + p.poll());
    		
            in.write("2nd Stock: " + p.poll());
    		 
            in.write("3rd Stock: " + p.poll());
    		
            in.write("4th Stock: " + p.poll());
          
            in.write("5th Stock: " + p.poll());
          
            in.write("</td></tr>");
        
            in.write("</table></body></html>");
            in.close();
        } catch (IOException e) {
        	
        }	
  }
}