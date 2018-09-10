package com.raccoonberus.clientService.ws.endpoint;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;
import java.io.IOException;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.*;

public class ClientEndpointTest extends BaseWSTester {
    @Test
    public void createClientSimple() throws IOException {
        Source requestPayload = new StringSource(
                "<tns:CreateClientSimpleRequest xmlns:tns=\"http://model.ws.clientsvc.raccoonberus.com/\">\n" +
                        "    <tns:lastName>Smith</tns:lastName>\n" +
                        "    <tns:firstName>John</tns:firstName>\n" +
                        "</tns:CreateClientSimpleRequest>"
        );
        Source responsePayload = new StringSource(
                "<tns:CreateClientSimpleResponse xmlns:tns=\"http://model.ws.clientsvc.raccoonberus.com/\">\n" +
                        "    <tns:id>1</tns:id>\n" +
                        "</tns:CreateClientSimpleResponse>"
        );
        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(payload(responsePayload))
                .andExpect(validPayload(xsdSchema));
    }
}