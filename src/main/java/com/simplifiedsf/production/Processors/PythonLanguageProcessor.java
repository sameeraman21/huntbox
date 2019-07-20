package com.simplifiedsf.production.Processors;

import com.simplifiedsf.production.debug.TerminalDebug;
import com.simplifiedsf.production.entities.CodeRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PythonLanguageProcessor implements LanguageProcessor {
    @Autowired
    TerminalDebug terminalDebug;
    @Override
    public String runCode(CodeRequestEntity codeRequestEntity) {

        return null;
    }

    @Override
    public boolean compileCode(CodeRequestEntity codeRequestEntity) {
        return false;
    }

    @Override
    public boolean validateCode(CodeRequestEntity codeRequestEntity) {
        return false;
    }
}
