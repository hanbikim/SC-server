package com.togivemeasocker.scserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subject {
    @Id
    private Long id;

    private String name;

    private String professorName;
}
