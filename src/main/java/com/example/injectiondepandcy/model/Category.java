package com.example.injectiondepandcy.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @ManyToMany(mappedBy = "categories")
    public List<Book> books;
}