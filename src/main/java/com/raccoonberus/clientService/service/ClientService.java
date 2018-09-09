package com.raccoonberus.clientService.service;

import com.raccoonberus.clientService.domain.Client;

public interface ClientService {
    void saveOrUpdate(Client client);

    Client find(long id);
}
