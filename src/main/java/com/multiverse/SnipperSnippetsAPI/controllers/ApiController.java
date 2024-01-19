package com.multiverse.SnipperSnippetsAPI.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/snippets")
public class ApiController {
    @GetMapping("")
    public List<String> getAllSnippets() {
        return List.of("test", "1");
    }
}
