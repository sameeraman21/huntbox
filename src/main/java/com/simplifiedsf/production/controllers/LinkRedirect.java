package com.simplifiedsf.production.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class LinkRedirect {
    @RequestMapping(value = "/test/{hash}")
    @ResponseBody
    public String link(@PathVariable String  hash){
        // 1) verify hash was not made up
        // 2) do whatever needs done with hash
        return "somewhereElse";
    }
}
