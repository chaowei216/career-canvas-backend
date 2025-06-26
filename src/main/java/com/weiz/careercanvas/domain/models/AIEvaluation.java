package com.weiz.careercanvas.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AIEvaluation {

    private String id;

    private BigDecimal matchPercentage;

    private String strengthAnalysis;

    private String improvementSuggestions;

    private String skillGapAnalysis;

    private String overallRecommendation;

    private LocalDateTime evaluatedAt;
}
