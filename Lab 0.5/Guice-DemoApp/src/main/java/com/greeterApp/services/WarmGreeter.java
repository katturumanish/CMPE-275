package com.greeterApp.services;

import com.google.inject.Inject;
import com.greeterApp.annotations.str;

public class WarmGreeter implements Greeter {
   String name;
   
   @Inject
   public WarmGreeter(@str String name) {
	   this.name = name;
   }

 
   public void greet() {
	System.out.println("Hello, my dear World. I am "+ name +". Nice to see you!");
   }
}
