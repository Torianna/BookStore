package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")

public class Book {

    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String author;
    private String ISBN;
}
