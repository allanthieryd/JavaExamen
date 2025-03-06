package com.example.motivational_chat_app.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
public class Discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String message;
    private String quote;

    @CreationTimestamp // Hibernate gère automatiquement la date d'insertion
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Getters et setters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
