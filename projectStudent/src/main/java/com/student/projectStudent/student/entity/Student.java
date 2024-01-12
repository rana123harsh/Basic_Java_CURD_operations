package com.student.projectStudent.student.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "student", schema = "studentdb_schema")
public class Student {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false)
    private UUID student_id;
    private String student_name;
    private int student_age;
    private String student_address;

    public Student() {
    }

}