package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.AchievementType;
import com.weiz.careercanvas.domain.enums.VisibilityStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {

    private String id;

    private String title;

    private String description;

    private LocalDate dateAchieved;

    private AchievementType achievementType;

    private String issuingOrganization;

    private String impactDescription;

    private List<String> relatedSkills;

    private String proofLink;

    private VisibilityStatus visibilityStatus;
}
