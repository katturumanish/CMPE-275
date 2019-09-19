package com.greeterApp.services;

import com.google.inject.Inject;
import com.greeterApp.annotations.str1;

public class CoolGreeter implements Greeter {
   String name;
   
   @Inject
   public CoolGreeter(@str1 String name) {
	   this.name = name;
   }
   
   public void greet() {
	System.out.println("Hey World. Me " + name);    
   }
   
}
