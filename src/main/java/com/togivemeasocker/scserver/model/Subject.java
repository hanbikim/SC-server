package com.togivemeasocker.scserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    private Long id;

    private String name;

    private String professorName;
}
