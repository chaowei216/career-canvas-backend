package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.InterviewJourneyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterviewJourney {

    private String id;

    private String jobTitle;

    private String companyName;

    private LocalDate applicationDate;

    private InterviewJourneyStatus currentStatus;

    private Integer totalInterviewRounds;

    private LocalDateTime startDate;
}
