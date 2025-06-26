package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.SkillProficiencyLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    private String id;

    private String name;

    private SkillProficiencyLevel proficiencyLevel;

    private Integer yearsOfExperience;
}
