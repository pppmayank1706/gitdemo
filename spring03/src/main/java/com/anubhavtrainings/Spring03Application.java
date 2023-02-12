package com.anubhavtrainings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anubhavtrainings.myclasses.laptop;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring03Application.class, args);
		
	     Object appleI80 = context.getBean(laptop.class);
	     ((laptop) appleI80).setBrandName("Apple");
	     System.out.println(appleI80.toString());
	}

}
