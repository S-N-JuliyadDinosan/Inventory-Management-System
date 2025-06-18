package com.Juliyad.User_Management_Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String role;
    private Long nicNumber;

    public User(String name, String role, Long nicNumber){
        this.name = name;
        this.role = role;
        this.nicNumber = nicNumber;
    }

}
