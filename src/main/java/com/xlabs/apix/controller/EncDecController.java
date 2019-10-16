package com.xlabs.apix.controller;

import com.xlabs.apix.service.EncDecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EncDecController {

    @Autowired
    private EncDecService encDecService;

    @GetMapping("/encrypt")
    public String encryptText(@RequestParam("text") String text) throws Exception{
        return encDecService.encryptText(text);
    }

    @GetMapping("/decrypt")
    public String decryptText(@RequestParam("text") String text) throws Exception{
        return encDecService.decryptText(text);
    }
}
