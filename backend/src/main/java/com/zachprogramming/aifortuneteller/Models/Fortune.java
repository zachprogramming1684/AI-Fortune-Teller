package com.zachprogramming.aifortuneteller.Models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Fortune
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fortuneText;
    private LocalDateTime dateGenerated;

    @ManyToOne
    @JoinColumn(name = "user_id") // this basically creates a many to one relationship between fortunes and users
    private User user;

    public Fortune()
    {}

    public Fortune(Long id, String fortuneText, LocalDate dateGenerated)
    {
        this.id = id;
        this.fortuneText = fortuneText;
        this.dateGenerated = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFortuneText() {
        return fortuneText;
    }

    public void setFortuneText(String fortuneText) {
        this.fortuneText = fortuneText;
    }

    public LocalDateTime getDateGenerated() {
        return dateGenerated;
    }

    public void setDateGenerated(LocalDateTime dateGenerated) {
        this.dateGenerated = dateGenerated;
    }
}
