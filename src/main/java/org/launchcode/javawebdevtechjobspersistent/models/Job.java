package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToMany
    public List<Skill>skills=new ArrayList<>();


    @ManyToOne
    private Employer employer;

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//
//    private String employer;
//
//    private String skills;

    public Job() {
    }

    public Job(Employer employer, List<Skill> Skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer=employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List <Skill> skills) {
        this.skills = skills;
    }
}
