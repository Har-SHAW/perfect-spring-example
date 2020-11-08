package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    private String projectName;
    private Integer ideaOwner;

    @ManyToOne
    @JoinColumn(name = "mentor_id", unique = true)
    private Mentor mentor;

    public Integer getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Integer getIdeaOwner() {
        return ideaOwner;
    }

    public Mentor getModelEntity() {
        return mentor;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setIdeaOwner(Integer ideaOwner) {
        this.ideaOwner = ideaOwner;
    }

    public void setModelEntity(Mentor mentor) {
        this.mentor = mentor;
    }
}
