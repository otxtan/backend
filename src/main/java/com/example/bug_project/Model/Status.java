package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Status_id")
    private Long id;
    private String status;

    @OneToOne(mappedBy = "status")
    private Issue issue;



}
