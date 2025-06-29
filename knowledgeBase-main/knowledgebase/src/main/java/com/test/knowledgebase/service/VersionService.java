package com.test.knowledgebase.service;

import com.test.knowledgebase.entity.Version;
import com.test.knowledgebase.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VersionService {
    @Autowired
    private VersionRepository versionRepository;

    public List<Version> getVersionsByDocument(Long docId) {
        return versionRepository.findByDocumentIdOrderByModifiedAtDesc(docId);
    }

    public Version save(Version version) {
        return versionRepository.save(version);
    }
}
