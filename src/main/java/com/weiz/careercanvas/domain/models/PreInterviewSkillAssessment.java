package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.CareerStageMatch;
import com.weiz.careercanvas.domain.enums.ConfidenceLevel;
import com.weiz.careercanvas.domain.enums.InterviewPerformancePotential;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PreInterviewSkillAssessment {

    private String id;

    private String jobTitle;

    private String jobDescription;

    private LocalDateTime assessmentDate;

    private BigDecimal overallMatchPercentage;

    private CareerStageMatch careerStageMatch;

    private Map<String, Object> requiredSkills;

    private Map<String, Object> portfolioSkills;

    private List<String> criticalSkillGaps;

    private List<String> recommendedSkillImprovements;

    private Map<String, Object> learningResources;

    private BigDecimal industryAverageMatch;

    private BigDecimal peerComparisonPercentile;

    private ConfidenceLevel confidenceLevel;

    private InterviewPerformancePotential potentialInterviewPerformance;

    private String strengthsSummary;

    private String improvementAreas;

    private String interviewPreparationAdvice;

    private String aiModelVersion;

    private BigDecimal confidenceScore;
}
