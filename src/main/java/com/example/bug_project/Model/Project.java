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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Project_id")
    private Long id;
    private String projectCode;
    private String projectName;
    private Long startDate;
    private Long endDate;
    private Boolean status;
    private Long numberOfMember;
    private String description;
    @ManyToMany(mappedBy = "projects")
    private List<Users> users;
    @OneToMany(mappedBy="project")
    private List<Task> task;
    @OneToMany(mappedBy="project")
    private List<Issue> issues;


}
