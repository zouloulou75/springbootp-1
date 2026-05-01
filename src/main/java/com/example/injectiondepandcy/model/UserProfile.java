package com.example.injectiondepandcy.model;

import jakarta.persistence.*;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String fullName;
    public String phone;
    public String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;
}
