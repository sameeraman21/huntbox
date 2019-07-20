package com.simplifiedsf.production.controllers;


import com.simplifiedsf.production.debug.TerminalDebug;
import com.simplifiedsf.production.entities.CodeRequestEntity;
import com.simplifiedsf.production.services.ExecuteLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExecuteCodeController {
    @Autowired
    TerminalDebug terminalDebug;
    @Autowired
    ExecuteLanguageService executeLanguageService;
    @RequestMapping(value = "/run",  method = RequestMethod.POST, consumes = {"application/JSON"})
    @ResponseBody
    public String run(@RequestBody CodeRequestEntity codeRequestEntity){
        terminalDebug.print(codeRequestEntity.getUserId()+" "+codeRequestEntity.getCodeToRun()+" "+codeRequestEntity.getLanguageType());
        executeLanguageService.runLanguage(codeRequestEntity);
        return "hello";
    }

    @RequestMapping(value = "/compile",  method = RequestMethod.POST, consumes = {"application/JSON"})
    @ResponseBody
    public String compile(@RequestBody CodeRequestEntity codeRequestEntity){
        terminalDebug.print(codeRequestEntity.getUserId()+" "+codeRequestEntity.getCodeToRun()+" "+codeRequestEntity.getLanguageType());
        executeLanguageService.compileLanguage(codeRequestEntity);
        return "hello";
    }

}
