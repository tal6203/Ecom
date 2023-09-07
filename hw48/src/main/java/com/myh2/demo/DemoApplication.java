package com.myh2.demo;

import com.myh2.demo.model.Book;
import com.myh2.demo.model.ProductOrders;
import com.myh2.demo.repository.BookRepository;
import com.myh2.demo.repository.ProductOrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);

	}

	@Bean
	CommandLineRunner commandLineRunner1(BookRepository repository1,ProductOrderRepository repository2) {
		return args -> {
			repository1.save(new Book(null, "Spring boot in Action", 394, "Craig Walls",150));
			repository2.save(new ProductOrders(null,"table","eden",20,1));
		};
	}


}
