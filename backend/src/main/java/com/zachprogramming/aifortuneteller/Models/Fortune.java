package com.zachprogramming.aifortuneteller.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Fortune
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fortuneText;
    private LocalDate dateGenerated;

    public Fortune()
    {}

    public Fortune(Long id, String fortuneText)
    {
        this.id = id;
        this.fortuneText = fortuneText;
    }
}
