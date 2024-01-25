package com.multiverse.SnipperSnippetsAPI.controllers;


import com.multiverse.SnipperSnippetsAPI.models.SnippetModel;
import com.multiverse.SnipperSnippetsAPI.services.ReadXmlDomParser;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;





@RestController
@RequestMapping("/snippets")
public class ApiController {

    private final ArrayList<SnippetModel> snippetsList = ReadXmlDomParser.seed();

    public ApiController() throws ParserConfigurationException {
    }

    @GetMapping("/all")
    public List<SnippetModel> getAllSnippets() {
        return snippetsList;
    }


    @GetMapping("/{id}")
    public List<SnippetModel> getOneSnippet(@PathVariable int id) {
        return snippetsList.stream().filter(snippet -> snippet.getId() == id).toList();
    }


    @PostMapping()
    String insert(@RequestBody SnippetModel ob) {
        snippetsList.add(new SnippetModel(ob.getId(), ob.getLanguage(), ob.getCode()));
        return "done";


    }

}





