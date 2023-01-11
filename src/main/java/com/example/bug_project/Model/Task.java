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
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Task_id")
    private Long id;
    private String nameTask;
    private Long startDate;
    private Long endDate;
    private Float progess;
    @ManyToOne
    @JoinColumn(name="Project_id", nullable=false)
    private Project project;

    @OneToMany(mappedBy="task")
    private List<Issue> issue;


}
