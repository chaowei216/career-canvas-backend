package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.CertificationVerificationStatus;
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
public class Certification {

    private String id;

    private String name;

    private String issuingOrganization;

    private LocalDate issueDate;

    private LocalDate expirationDate;

    private String credentialId;

    private String credentialUrl;

    private String description;

    private List<String> skillsCovered;

    private CertificationVerificationStatus verificationStatus;
}
