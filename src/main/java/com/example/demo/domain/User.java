package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
@Component
@Table(name = "user")
public class User {

    @Id
    private String userId;

    private String userName;

    private String userEmail;
}
