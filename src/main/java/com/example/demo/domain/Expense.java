package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will act as primaryKey and it gets auto incremented
    @Column(name = "expenseId")
    private Long id;

    private String expType;
    private Integer expAmount;
    private LocalDate expDate;
    private String expDesc;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)

    private User user;

    public Integer getExpAmount() {
        return expAmount;
    }
}
