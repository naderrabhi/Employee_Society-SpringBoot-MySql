package com.employee.society.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "society_project")
public class SocietyProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "societyId")
    private SocietyEntity society;

    @ManyToOne
    @JoinColumn(name = "projectId")
    private ProjectEntity project;

    public SocietyProjectEntity() {
    }

    public SocietyProjectEntity(SocietyEntity society, ProjectEntity project) {
        this.society = society;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SocietyEntity getSociety() {
        return society;
    }

    public void setSociety(SocietyEntity society) {
        this.society = society;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }
}
