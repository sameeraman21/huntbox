package com.simplifiedsf.production.debug;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class TerminalDebug {
    @Getter@Setter
    public   boolean isDebug =true;
    public  void print(String message){
        if(isDebug == true)
        System.out.println(message);
    }

}
