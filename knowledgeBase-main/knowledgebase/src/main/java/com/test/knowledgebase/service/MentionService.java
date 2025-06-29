package com.test.knowledgebase.service;

import com.test.knowledgebase.entity.Mention;
import com.test.knowledgebase.repository.MentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentionService {
    @Autowired
    private MentionRepository mentionRepository;

    public Mention save(Mention mention) {
        return mentionRepository.save(mention);
    }
}
