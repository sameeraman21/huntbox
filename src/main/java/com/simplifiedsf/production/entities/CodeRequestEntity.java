package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class CodeRequestEntity {
    private String languageType;
    private String codeToRun;
    private Integer userId;

}
