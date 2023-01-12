package com.example.bug_project.Model;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Users_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

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

