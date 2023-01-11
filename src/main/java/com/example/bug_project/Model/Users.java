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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Users_id")
    private Long id;
    private String password;
    private String salt;
    private String email;
    private String fullName;
    private String position;
    @ManyToMany
    @JoinTable(name = "Users_Project", joinColumns = @JoinColumn(name = "Users_id"), inverseJoinColumns = @JoinColumn(name = "Project_id"))
    private List<Project> projects;

    @ManyToMany
    @JoinTable(name = "Users_Issue", joinColumns = @JoinColumn(name = "Users_id"), inverseJoinColumns = @JoinColumn(name = "Issue_id"))
    private List<Issue> issue;
    @ManyToMany
    @JoinTable(name = "Users_Issue", joinColumns = @JoinColumn(name = "Assignee_id"), inverseJoinColumns = @JoinColumn(name = "Issue_id"))
    private List<Issue> issue1;


    @ManyToMany
    @JoinTable(name = "Users_Role", joinColumns = @JoinColumn(name = "Users_id"), inverseJoinColumns = @JoinColumn(name = "Role_id"))
    private List<Role> role;

    @ManyToMany
    @JoinTable(name = "Users_Function", joinColumns = @JoinColumn(name = "Users_id"), inverseJoinColumns = @JoinColumn(name = "Function_id"))
    private List<Function> function;




}

