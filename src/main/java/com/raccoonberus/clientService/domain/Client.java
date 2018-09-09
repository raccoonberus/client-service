package com.raccoonberus.clientService.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Name> names = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Contact> contacts = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "client")
    private List<Document> documents = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Client setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public List<Name> getNames() {
        return names;
    }

    public Client setNames(List<Name> names) {
        this.names = names;
        return this;
    }

    public Client addName(Name name) {
        name.setClient(this);
        this.names.add(name);
        return this;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Client setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    public Client addContact(Contact contact) {
        contact.setClient(this);
        this.contacts.add(contact);
        return this;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Client setAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Client addAddress(Address address) {
        address.setClient(this);
        this.addresses.add(address);
        return this;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public Client setDocuments(List<Document> documents) {
        this.documents = documents;
        return this;
    }

    public Client addDocument(Document document) {
        document.setClient(this);
        this.documents.add(document);
        return this;
    }
}
