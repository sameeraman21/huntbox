package com.simplifiedsf.production.analyzers;

import com.simplifiedsf.production.Processors.LanguageProcessor;
import com.simplifiedsf.production.enums.LanguageProcessorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class  LanguageTypeAnalyzer {
    @Autowired
        ApplicationContext  applicationContext;
      public LanguageProcessor getLanguageTypeBean(int languageType){
          LanguageProcessorType languageProcessorType = LanguageProcessorType.getLanguageType(languageType);
          return    applicationContext.getBean(languageProcessorType.getBeanName(), LanguageProcessor.class);



      }

}
