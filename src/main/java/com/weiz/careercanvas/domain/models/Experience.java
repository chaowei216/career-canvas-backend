package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.EmploymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

    private String id;

    private String companyName;

    private String jobTitle;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean isCurrent = false;

    private String description;

    private String location;

    private EmploymentType employmentType;
}
