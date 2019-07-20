package com.simplifiedsf.production.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;


public enum LanguageProcessorType {

    DEDUCTION_SUCCESSFUL("javaLanguageProcessor", 1),
    DEREGISTRATION("pythonLanguageProcessor", 2),
    GRACE_PERIOD("cLanguageProcessor", 3),
    INVALID_EVENT("ex", -1);

    @Getter
    private Integer typeId;
    @Getter
    private String beanName;

    LanguageProcessorType(String beanName, int typeId){
        this.beanName = beanName;
        this.typeId = typeId;
    }



    public static LanguageProcessorType getLanguageType(Integer typeId) {
        for (LanguageProcessorType languageType : values()) {
            if (languageType.getTypeId() == typeId) {
                return languageType;
            }
        }
        return INVALID_EVENT;
    }
}
