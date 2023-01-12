package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_id")
    private Long id;
    private String nameRole;

    @ManyToMany(mappedBy = "role")
    private List<Users> users;

    @ManyToMany
    @JoinTable(name = "Role_Function", joinColumns = @JoinColumn(name = "Role_id"), inverseJoinColumns = @JoinColumn(name = "Function_id"))
    private List<Function> function;


}