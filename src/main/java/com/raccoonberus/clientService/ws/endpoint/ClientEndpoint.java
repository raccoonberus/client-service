package com.raccoonberus.clientService.ws.endpoint;

import com.raccoonberus.clientService.service.ClientService;
import com.raccoonberus.clientsvc.ws.model.CreateClientSimpleRequest;
import com.raccoonberus.clientsvc.ws.model.CreateClientSimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.raccoonberus.clientService.Application.WS_NAMESPACE_URL;

@Endpoint
public class ClientEndpoint {
    private final ClientService clientService;

    @Autowired
    public ClientEndpoint(
            ClientService clientService
    ) {
        this.clientService = clientService;
    }

    @PayloadRoot(namespace = WS_NAMESPACE_URL, localPart = "CreateClientSimpleRequest")
    @ResponsePayload
    public CreateClientSimpleResponse createClientSimple(@RequestPayload CreateClientSimpleRequest req) {
        CreateClientSimpleResponse response = new CreateClientSimpleResponse();
        response.setId(0);
        return response; // TODO: implement me!!
    }
}
