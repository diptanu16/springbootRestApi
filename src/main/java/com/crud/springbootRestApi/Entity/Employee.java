package com.crud.springbootRestApi.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "empdata")
public class Employee {

    @Id
    private String id;

    private String name;
    private String email;
    private String role;


}

