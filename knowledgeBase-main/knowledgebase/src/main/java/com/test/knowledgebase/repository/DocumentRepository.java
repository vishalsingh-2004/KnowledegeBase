package com.test.knowledgebase.repository;

import com.test.knowledgebase.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByTitleContainingIgnoreCase(String title);
    List<Document> findByContentContainingIgnoreCase(String content);
}
