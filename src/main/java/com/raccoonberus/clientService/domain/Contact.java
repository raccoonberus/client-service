package com.raccoonberus.clientService.domain;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    public enum Type {
        EMAIL, PHONE, MOBILE_PHONE, TELEGRAM
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type", nullable = false)
    private Type type;

    @Column(name = "value", nullable = false)
    private String value;

    private boolean verified = false;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Contact(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public Contact setId(Long id) {
        this.id = id;
        return this;
    }

    public Type getType() {
        return type;
    }

    public Contact setType(Type type) {
        this.type = type;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Contact setValue(String value) {
        this.value = value;
        return this;
    }

    public boolean isVerified() {
        return verified;
    }

    public Contact setVerified(boolean verified) {
        this.verified = verified;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Contact setClient(Client client) {
        this.client = client;
        return this;
    }

}