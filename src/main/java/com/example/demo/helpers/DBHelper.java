package com.example.demo.helpers;

import com.example.demo.config.AppConfig;
import com.example.demo.domain.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DBHelper {

    private static AnnotationConfigApplicationContext context;
    private static ExpenseService expenseService;

    static
    {
        context= new AnnotationConfigApplicationContext(AppConfig.class);
        expenseService= context.getBean(ExpenseService.class);
    }

    public static List<Expense> getExpensesById(String userId)
    {
        return expenseService.getAllExpenses(userId);
    }
}
