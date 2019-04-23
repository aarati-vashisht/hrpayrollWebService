package com.example.ResponseData;

import javax.persistence.*;

@SqlResultSetMapping(
        name = "SkillsMapping",
        classes = {
                @ConstructorResult(targetClass = SkillsData.class, columns = {
                        @ColumnResult(name = "SId", type = Integer.class),
                        @ColumnResult(name = "Skills", type = String.class)
                })
        })
@Entity
public class SkillsData {

    @Id
    int SId;
    String Skills;

    public SkillsData(int SId, String skills) {
        this.SId = SId;
        Skills = skills;
    }

    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }
}
