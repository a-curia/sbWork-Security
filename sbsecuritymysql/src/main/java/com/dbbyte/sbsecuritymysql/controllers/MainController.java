package com.dbbyte.sbsecuritymysql.controllers;



import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Public Hello To the World";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured")
    public String securedHello() {
        return "This is a secured section!";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "Alternate";
    }
}