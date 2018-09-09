package com.raccoonberus.clientService.domain;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    public enum Type { REGISTRATION, RESIDENcE }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Type type;

    @Column(name = "raw_content")
    private String rawContent;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Long getId() {
        return id;
    }

    public Address setId(Long id) {
        this.id = id;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Address setType(Type type) {
        this.type = type;
        return this;
    }

    public String getRawContent() {
        return rawContent;
    }

    public Address setRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Address setClient(Client client) {
        this.client = client;
        return this;
    }
}
