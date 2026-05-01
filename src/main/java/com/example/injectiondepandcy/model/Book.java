package com.example.injectiondepandcy.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public String author;

    @OneToMany(mappedBy = "book")
    public List<Borrow> borrows;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    public List<Category> categories;
}