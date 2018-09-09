package com.raccoonberus.clientService.dao;

import com.raccoonberus.clientService.domain.Client;

public interface ClientDao extends BaseCrudDao<Client> {
    Client findByContact(String contact);
}
