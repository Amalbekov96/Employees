package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String salary;

    @CreationTimestamp
    @DateTimeFormat(pattern="dd-MM-yyyy HH:mm")
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @UpdateTimestamp
    @DateTimeFormat(pattern="dd-MM-yyyy HH:mm")
    @Column(name = "end_date")
    private LocalDateTime endDate;


    @ManyToOne
    private Employees employee_id;
}
