package com.raccoonberus.clientService.service;

import com.raccoonberus.clientService.dao.ClientDao;
import com.raccoonberus.clientService.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    private final ClientDao clientDao;

    @Autowired
    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public void saveOrUpdate(Client client) {
        if (client.getId() == null)
            clientDao.create(client);
        else
            clientDao.update(client);
    }

    @Override
    public Client find(long id) {
        return clientDao.fint(id);
    }
}
