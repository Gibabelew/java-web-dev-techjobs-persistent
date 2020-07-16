package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs=new ArrayList<>();

    @NotBlank
    @Size (max = 50,message = "Description too long:")
    private String description;

//    @ManyToMany
//    private List<Skill> skills=new ArrayList<>();

    public Skill (){ }

    public Skill(String newDescription){
        super();
        this.description = newDescription;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}