package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")

public class Book {

    @Id
    @GeneratedValue
    private int id;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "user_id")
//    private List<User> users = new ArrayList<>();

    private String title;
    private String author;
    private String ISBN;
}
