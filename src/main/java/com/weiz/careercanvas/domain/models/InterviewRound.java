package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.InterviewJourneyStatus;
import com.weiz.careercanvas.domain.enums.InterviewType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRound {

    private String id;

    private Integer roundNumber;

    private LocalDateTime interviewDate;

    private InterviewType interviewType;

    private String interviewerName;

    private String interviewerRole;

    private String notes;

    private InterviewJourneyStatus status;
}
