package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.LanguageProficiencyLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    private String id;

    private String languageName;

    private LanguageProficiencyLevel proficiencyLevel;
}
