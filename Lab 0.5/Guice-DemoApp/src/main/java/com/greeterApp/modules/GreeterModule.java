package com.greeterApp.modules;

import java.lang.annotation.Annotation;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.greeterApp.annotations.str;
import com.greeterApp.annotations.str1;
import com.greeterApp.services.CoolGreeter;
import com.greeterApp.services.Greeter;
import com.greeterApp.services.WarmGreeter;

public class GreeterModule extends AbstractModule{
   protected void configure() {
	   bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class);
	   bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class);
	   bind(String.class).annotatedWith((Class<? extends Annotation>) str.class).toInstance("Warm Greeter");
	   bind(String.class).annotatedWith((Class<? extends Annotation>) str1.class).toInstance("Cool Greeter");
   }
}
