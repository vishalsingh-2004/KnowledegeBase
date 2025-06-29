package com.test.knowledgebase.repository;

import com.test.knowledgebase.entity.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VersionRepository extends JpaRepository<Version, Long> {
    List<Version> findByDocumentIdOrderByModifiedAtDesc(Long documentId);
}
