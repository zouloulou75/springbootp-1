package com.example.injectiondepandcy.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public LocalDate borrowDate;
    public LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    public Book book;
}