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
                        "    <tns:middleName>Aragorn</tns:middleName>\n" +
                        "    <tns:birthDate>1989-12-23</tns:birthDate>\n" +
                        "    <tns:mobilePhone>+7 (999) 888-77-11</tns:mobilePhone>\n" +
                        "    <tns:email>smith.john@wildfowl.com</tns:email>\n" +
                        "    <tns:address>Zimbabwe, Wildfowl street, 221</tns:address>\n" +
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

    @Test
    public void createClientStandard() throws IOException {
        Source requestPayload = new StringSource(
                "<tns:CreateClientStandardRequest xmlns:tns=\"http://model.ws.clientsvc.raccoonberus.com/\">\n" +
                        "    <tns:name>\n" +
                        "        <tns:lastName>Smith</tns:lastName>\n" +
                        "        <tns:firstName>John</tns:firstName>\n" +
                        "        <tns:middleName>Aragorn</tns:middleName>\n" +
                        "    </tns:name>\n" +
                        "    <tns:birthDate>1989-12-23</tns:birthDate>\n" +
                        "    <tns:documents>\n" +
                        "        <tns:document type=\"PASSPORT\" value=\"0000 000000\"/>" +
                        "        <tns:document type=\"INSURANCE_POLICY\" value=\"0000 000000\"/>" +
                        "        <tns:document type=\"INTERNATIONAL_PASSPORT\" value=\"0000 000000\"/>" +
                        "    </tns:documents>\n" +
                        "    <tns:contacts>\n" +
                        "        <tns:contact type=\"mobilePhone\">+7 (999) 888-77-11</tns:contact>" +
                        "        <tns:contact type=\"email\">smith.john@wildfowl.com</tns:contact>" +
                        "    </tns:contacts>\n" +
                        "    <tns:addresses>\n" +
                        "        <tns:address type=\"registration\">New York, Spring street, 12</tns:address>\n" +
                        "        <tns:address type=\"residence\">Zimbabwe, Wildfowl street, 221</tns:address>\n" +
                        "    </tns:addresses>\n" +
                        "</tns:CreateClientSimpleRequest>"
        );
        Source responsePayload = new StringSource(
                "<tns:CreateClientStandardResponse xmlns:tns=\"http://model.ws.clientsvc.raccoonberus.com/\">\n" +
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