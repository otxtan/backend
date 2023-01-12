package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
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

    public Float getProgess() {
        return progess;
    }

    public void setProgess(Float progess) {
        this.progess = progess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Float progess;
    private String description;
    @ManyToOne
    @JoinColumn(name="Project_id", nullable=false)
    private Project project;

    @OneToMany(mappedBy="task")
    private List<Issue> issue;


}
