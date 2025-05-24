package com.example.demo.repository;

import com.example.demo.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query(value = "SELECT * from expense e where e.userId= :userId", nativeQuery = true)
    public List<Expense> getExpensesByUserId(@Param("userId") String userId);
}