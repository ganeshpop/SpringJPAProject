package com.ganesh.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private List<Employee> employee;

    public Department(String name){
        this.name = name;
    }
}
