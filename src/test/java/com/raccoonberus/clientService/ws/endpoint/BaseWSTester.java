package com.raccoonberus.clientService.ws.endpoint;

import com.raccoonberus.clientService.Application;
import com.raccoonberus.clientService.ws.config.TestConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.test.server.MockWebServiceClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {
        Application.class,
        TestConfig.class,
})
public abstract class BaseWSTester {

    @Autowired
    private ApplicationContext applicationContext;

    protected MockWebServiceClient mockClient;
    protected Resource xsdSchema = new ClassPathResource("structure.xsd");

    @Before
    public void setUp() {
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }
}
