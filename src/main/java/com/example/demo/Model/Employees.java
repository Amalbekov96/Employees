package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    private Boolean active;

}
