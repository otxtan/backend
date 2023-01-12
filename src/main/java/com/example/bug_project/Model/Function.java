package com.example.bug_project.Model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Function {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Function_id")
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "function")
    private List<Users> users;

    @ManyToMany(mappedBy = "function")
    private List<Role> role;


}