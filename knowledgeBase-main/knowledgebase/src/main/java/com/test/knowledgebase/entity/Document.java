package com.test.knowledgebase.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private boolean isPublic;

    @ManyToOne
    private User author;

    @ManyToMany
    @JoinTable(name = "document_mentions",
        joinColumns = @JoinColumn(name = "document_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> mentionedUsers = new HashSet<>();

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<Version> versions = new ArrayList<>();
}