package com.richardgohcr.expensetracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private Long id;

    private Instant expenseDate;

    private String description;

    private String location;


    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;


}
