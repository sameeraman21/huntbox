package com.simplifiedsf.production.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;


public enum LanguageProcessorType {

    DEDUCTION_SUCCESSFUL("javaLanguageProcessor", "java"),
    DEREGISTRATION("pythonLanguageProcessor", "python"),
    GRACE_PERIOD("gccLanguageProcessor", "c"),
    INVALID_EVENT("ex", "No processor");

    @Getter
    private String typeId;
    @Getter
    private String beanName;

    LanguageProcessorType(String beanName, String typeId){
        this.beanName = beanName;
        this.typeId = typeId;
    }



    public static LanguageProcessorType getLanguageType(String typeId) {
        for (LanguageProcessorType languageType : values()) {
            if (languageType.getTypeId().equals(typeId)) {
                return languageType;
            }
        }
        return INVALID_EVENT;
    }
}
