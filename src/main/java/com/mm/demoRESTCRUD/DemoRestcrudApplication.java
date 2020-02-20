package com.mm.demoRESTCRUD;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEncryptableProperties
public class DemoRestcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestcrudApplication.class, args);
	}


	@Component
	public class MyRunner implements CommandLineRunner {

		//@Value("${myProperty}")
		//private String myProperty;

		@Override
		public void run(String... args) throws Exception {
			//System.out.println("My property is = " + myProperty);
		}

	}
}
