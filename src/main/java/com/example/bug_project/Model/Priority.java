package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Priority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Priority_id")
    private Long id;
    private String name;

    @OneToOne(mappedBy = "priority")
    private Issue issue;
}

