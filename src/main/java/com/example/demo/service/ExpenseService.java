package com.example.demo.service;

import com.example.demo.domain.Expense;

import java.util.List;

public interface ExpenseService {

    public List<Expense> getAllExpenses(String userId);
}
