package com.example.injectiondepandcy.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String username;
    public String email;
    public String password;

    @OneToOne(mappedBy = "user")
    public UserProfile profile;

    @OneToMany(mappedBy = "user")
    public List<Borrow> borrows;
}