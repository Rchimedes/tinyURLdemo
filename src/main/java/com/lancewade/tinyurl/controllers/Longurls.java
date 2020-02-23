package com.lancewade.tinyurl.controllers;


import com.lancewade.tinyurl.services.LongurlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Longurls {
    private final LongurlService longurlService;

    public Longurls(LongurlService longurlService) {
        this.longurlService = longurlService;
    }

    @GetMapping ("/")
    public String index(){
        return "index.jsp";
    }
}
