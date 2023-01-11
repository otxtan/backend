package com.example.bug_project.Model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Function {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Function_id")
    private Long id;
    private String nameFunction;

    @ManyToMany(mappedBy = "function")
    private List<Users> users;

    @ManyToMany(mappedBy = "function")
    private List<Role> role;


}