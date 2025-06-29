package com.test.knowledgebase.service;

import com.test.knowledgebase.entity.Document;
import com.test.knowledgebase.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public Document save(Document doc) {
        return documentRepository.save(doc);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Optional<Document> findById(Long id) {
        return documentRepository.findById(id);
    }

    public List<Document> search(String keyword) {
        return documentRepository.findByTitleContainingIgnoreCase(keyword);
    }
}
