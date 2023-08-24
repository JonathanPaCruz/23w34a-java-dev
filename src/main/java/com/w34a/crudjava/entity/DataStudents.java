package com.w34a.crudjava.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_students")
public class DataStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "Email address", unique = true,nullable = false)
    private String email;
}
