package com.example.demo.tests;

import com.example.demo.domain.Expense;
import com.example.demo.helpers.DBHelper;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {

    @Test
    public void getDataTest() {

        List<Expense> expenseList= DBHelper.getExpensesById("12121");
        if(expenseList.isEmpty())
            System.out.println("NOTHING TO SHOW");
        else
        {
            for (Expense expense:expenseList)
                System.out.println(expense.getExpAmount());
        }

    }
}
