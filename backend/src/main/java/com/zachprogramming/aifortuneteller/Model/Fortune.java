package com.zachprogramming.aifortuneteller.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Fortune
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fortuneText;
    private LocalDateTime dateGenerated;
    private List<String> attributes;

    @ManyToOne(fetch = FetchType.LAZY) //todo: figure out what this means
    @JoinColumn(name = "user_id") // this basically creates a many to one relationship between fortunes and users
    private User user;

    public Fortune()
    {}

    public Fortune(Long id, String fortuneText, LocalDate dateGenerated,  List<String> attributes, User user)
    {
        this.id = id;
        this.fortuneText = fortuneText;
        this.dateGenerated = LocalDateTime.now();
        this.attributes = attributes;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }
}
