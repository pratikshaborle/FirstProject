package com.first.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index() {
	   return "index";
   }
   
   /*
  @RequestMapping(value = "/redirect", method = RequestMethod.GET)
   public String redirect() {
     
      return "redirect:sample";
   }
    */
  
   @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String dashboard() {
      
       return "dashboard";
    }
    

   @RequestMapping(value = "/sample", method = RequestMethod.GET)
   public String finalPage() {
     
      return "sample";
   }
}