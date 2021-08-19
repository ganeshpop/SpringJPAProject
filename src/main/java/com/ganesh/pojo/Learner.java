package com.ganesh.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Learner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
//    @ManyToMany  //One learner is being taught by many trainers
//    private List<Trainer> trainers=new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Trainer trainer;

    public Learner(String name){
        this.name = name;
    }
}
