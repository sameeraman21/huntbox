package com.simplifiedsf.production.services;

import com.simplifiedsf.production.Processors.LanguageProcessor;
import com.simplifiedsf.production.analyzers.LanguageTypeAnalyzer;
import com.simplifiedsf.production.entities.CodeRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecuteLanguageService {
    @Autowired
    LanguageTypeAnalyzer languageTypeAnalyzer;
    public void  runLanguage(CodeRequestEntity codeRequestEntity){
        LanguageProcessor languageProcessor = languageTypeAnalyzer.getLanguageTypeBean(codeRequestEntity.getLanguageType());
        languageProcessor.validateCode(codeRequestEntity);
        languageProcessor.runCode(codeRequestEntity);
    }
    public void  compileLanguage(CodeRequestEntity codeRequestEntity){
        LanguageProcessor languageProcessor = languageTypeAnalyzer.getLanguageTypeBean(codeRequestEntity.getLanguageType());
        languageProcessor.validateCode(codeRequestEntity);
        languageProcessor.compileCode(codeRequestEntity);
    }
}
