package com.simplifiedsf.production.services;

import com.simplifiedsf.production.Processors.LanguageProcessor;
import com.simplifiedsf.production.analyzers.LanguageTypeAnalyzer;
import com.simplifiedsf.production.entities.CodeRequestEntity;
import com.simplifiedsf.production.enums.LanguageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecuteLanguageService {
    @Autowired
    LanguageTypeAnalyzer languageTypeAnalyzer;
    public void  runLanguage(CodeRequestEntity codeRequestEntity){
        LanguageType languageType = LanguageType.getLanguageType(codeRequestEntity.getLanguageType());
        System.out.println("      language type "+languageType);
        Integer id = languageType.getTypeId();
        System.out.println("      language type "+id);

        LanguageProcessor languageProcessor = languageTypeAnalyzer.getLanguageTypeBean(id);
        languageProcessor.validateCode(codeRequestEntity);
        languageProcessor.runCode(codeRequestEntity);
    }
    public void  compileLanguage(CodeRequestEntity codeRequestEntity){
        LanguageType languageType = LanguageType.getLanguageType(codeRequestEntity.getLanguageType());
        System.out.println("      language type "+languageType);
        Integer id = languageType.getTypeId();
        System.out.println("      language type "+id);

        LanguageProcessor languageProcessor = languageTypeAnalyzer.getLanguageTypeBean(id);
        languageProcessor.validateCode(codeRequestEntity);
        languageProcessor.compileCode(codeRequestEntity);
    }
}
