package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO {

    private long id;
    private String name;

    public DepartmentDTO(){
    }

    public DepartmentDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        name = entity.name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
