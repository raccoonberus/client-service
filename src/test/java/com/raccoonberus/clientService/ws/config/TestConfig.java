package com.raccoonberus.clientService.ws.config;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
public class TestConfig {
//    @Bean
//    @Primary
//    public BSMHubClient bsmHubClient() throws HubServiceException {
//
//        BSMHubClient bsmHubClient = Mockito.mock(BSMHubClient.class);
//
//        Mockito.doReturn("666").when(bsmHubClient).getStationId();
//
//        ST_OpenSessionResponse openSessionResponse = new ST_OpenSessionResponse();
//        ST_SessionWS session = new ST_SessionWS();
//        session.setAccountId(FAKE_ACCOUNT_ID.intValue());
//        session.setSessionId(FAKE_SESSION_ID);
//        session.setRoleName("user");
//        openSessionResponse.setSession(session);
//        Mockito.doReturn(openSessionResponse).when(bsmHubClient).openSession(
//                ArgumentMatchers.eq("mock"),
//                ArgumentMatchers.eq("mock"),
//                ArgumentMatchers.anyBoolean(),
//                ArgumentMatchers.anyBoolean()
//        );
//
//        return bsmHubClient;
//    }
}
