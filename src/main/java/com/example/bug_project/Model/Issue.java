package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Issue{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Issue_id")
    private Long id;
    private String attachment;
    private String desription;
    private String summary;
    private Long startDate;
    private Long dueDate;
    @ManyToOne
    @JoinColumn(name="Task_id", nullable=false)
    private Task task;

    @OneToOne
    @JoinColumn(name = "Type_id")
    private Type type;

    @OneToOne
    @JoinColumn(name = "Priority_id")
    private Priority priority;
    @OneToOne
    @JoinColumn(name = "Project_id")
    private Project project;
    @OneToOne
    @JoinColumn(name = "Status_id")
    private Status status;

    @OneToOne
    @JoinColumn(name = "Category_id")
    private Category category;

    @ManyToMany(mappedBy = "issue")
    private List<Users> users;
    @ManyToMany(mappedBy = "issue1")
    private List<Users> user;


}
