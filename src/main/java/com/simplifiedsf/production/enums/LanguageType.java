package com.simplifiedsf.production.enums;

import lombok.Getter;

public enum LanguageType {
    JAVA("java", 1),
    PYTHON("python", 2),
    C("c", 3),
    INVALID_EVENT("ex", -1);

    @Getter
    private Integer typeId;
    @Getter
    private String beanName;

    LanguageType(String beanName, int typeId){
        this.beanName = beanName;
        this.typeId = typeId;
    }



    public static LanguageType getLanguageType(String type) {
        for (LanguageType languageType : values()) {
            if (languageType.getBeanName().equals(type)) {
                return languageType;
            }
        }
        return INVALID_EVENT;
    }
}
