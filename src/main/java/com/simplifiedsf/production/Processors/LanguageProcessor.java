package com.simplifiedsf.production.Processors;

import com.simplifiedsf.production.entities.CodeRequestEntity;

public interface LanguageProcessor {
    public String runCode(CodeRequestEntity codeRequestEntity);
    public boolean compileCode(CodeRequestEntity codeRequestEntity);
    public boolean  validateCode(CodeRequestEntity codeRequestEntity);
}
