package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.VisibilityStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {

    private String id;

    private String title;

    private String careerObjective;

    private String summary;

    private VisibilityStatus visibilityStatus = VisibilityStatus.PRIVATE;

}
