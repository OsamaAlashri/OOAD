package com.example.taskmanager.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private String priority; // "High", "Medium", "Low"

    @Column(nullable = false)
    private LocalDate deadline;

    @Column(nullable = false)
    private String status; // "Pending", "In Progress", "Completed"

    @ManyToOne
    private User assignedTo;
}
