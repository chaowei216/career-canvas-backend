package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.ProjectType;
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
public class Project {

    private String id;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean isCurrent = false;

    private ProjectType projectType;

    private String role;

    private List<String> technologies;

    private String projectLink;

    private String sourceCodeLink;

    private List<String> keyAchievements;

    private List<String> skillsDemonstrated;
}
