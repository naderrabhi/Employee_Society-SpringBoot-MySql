package com.employee.society.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "society")
public class SocietyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "societyEntity")
    private List<EmployeeEntity> employeeEntityList;

    public SocietyEntity() {
    }

    public SocietyEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SocietyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
