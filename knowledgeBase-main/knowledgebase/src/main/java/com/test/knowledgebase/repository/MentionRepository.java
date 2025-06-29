package com.test.knowledgebase.repository;

import com.test.knowledgebase.entity.Mention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentionRepository extends JpaRepository<Mention, Long> {
}
