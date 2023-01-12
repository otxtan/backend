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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(Long numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
