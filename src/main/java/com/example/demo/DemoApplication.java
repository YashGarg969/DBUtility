package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.Expense;
import com.example.demo.service.ExpenseService;
import com.example.demo.service.ExpenseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages ={"com.example.demo.repository","com.example.demo.service"})
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
public class DemoApplication {


	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			ExpenseService expenseService1 = context.getBean(ExpenseService.class);
			List<Expense> expenses = expenseService1.getAllExpenses("12121");
			for(Expense exp: expenses)
			{
				System.out.println(exp.getExpAmount());
			}
		}

	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Expense> expenseList= expenseService.getAllExpenses("12121");
//		if (expenseList.isEmpty())
//			System.out.println("NOTHING TO SHOW");
//		else
//			System.out.println(expenseList);
//	}
}
