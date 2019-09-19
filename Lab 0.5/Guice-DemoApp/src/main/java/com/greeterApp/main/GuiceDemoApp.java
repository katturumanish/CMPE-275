package com.greeterApp.main;
import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Named;
import com.greeterApp.modules.GreeterModule;
import com.greeterApp.services.Greeter;

/**
 * Guice HelloWorld!
 *
 */
public class GuiceDemoApp 
{
	@Inject 
	@Named("CoolGreeter")
	private Greeter coolGreeter;
	@Inject 
	@Named("WarmGreeter")
	private Greeter warmGreeter;
	
    public static void main( String[] args ){
    	GuiceDemoApp app = new GuiceDemoApp();
        Module module = new GreeterModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(app);//injects the implementation of the service
        
        app.coolGreeter.greet();
        app.warmGreeter.greet();
    }
}
