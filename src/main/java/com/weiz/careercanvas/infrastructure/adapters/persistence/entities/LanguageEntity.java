package com.weiz.careercanvas.infrastructure.adapters.persistence.entities;

import com.weiz.careercanvas.domain.enums.LanguageProficiencyLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "languages")
public class LanguageEntity extends AbstractEntity<String> {

    @Id
    @UuidGenerator
    @Column(name = "language_id")
    private String id;

    @Column(name = "language_name", length = 50)
    private String languageName;

    @Enumerated(EnumType.STRING)
    @Column(name = "proficiency_level", length = 50)
    private LanguageProficiencyLevel proficiencyLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private PortfolioEntity portfolio;
}
