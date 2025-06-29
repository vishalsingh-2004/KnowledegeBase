package com.test.knowledgebase.controller;

import com.test.knowledgebase.entity.Document;
import com.test.knowledgebase.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docs")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAll() {
        return documentService.findAll();
    }

    @PostMapping
    public Document create(@RequestBody Document doc) {
        return documentService.save(doc);
    }

    @GetMapping("/search")
    public List<Document> search(@RequestParam String keyword) {
        return documentService.search(keyword);
    }
}
