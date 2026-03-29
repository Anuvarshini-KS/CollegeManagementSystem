package com.kovanlabs.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TeacherEntity {

   @Id
    private Long id;
    private String teacherName;




}
