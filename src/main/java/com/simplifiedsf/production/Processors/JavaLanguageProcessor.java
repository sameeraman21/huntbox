package com.simplifiedsf.production.Processors;

import com.simplifiedsf.production.debug.TerminalDebug;
import com.simplifiedsf.production.entities.CodeRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class JavaLanguageProcessor implements LanguageProcessor {
    @Autowired
    TerminalDebug terminalDebug;
    @Override
    public String runCode(CodeRequestEntity codeRequestEntity) {
        BufferedWriter output = null;
        File file = new File("code-files/"+"filename.java");
        try {
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println(codeRequestEntity.getCodeToRun());
            writer.close();
        } catch ( IOException e ) {

            e.printStackTrace();
        } finally {
//            if ( output != null ) {
//            }
        }

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
