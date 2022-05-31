package com.servers.management.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String email;
    @Getter @Setter private String jobTitle;
    @Getter @Setter private String phone;
    @Getter @Setter private String imageUrl;
    @Column(nullable = false, updatable = false)
    @Getter @Setter private String employeeCode;
}
