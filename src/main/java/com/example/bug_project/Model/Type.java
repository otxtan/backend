package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Type_id")
    private Long id;
    private String name;

    @OneToOne(mappedBy="type")
    private Issue issue;



}
