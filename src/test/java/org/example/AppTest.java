package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class AppTest {

    @Autowired
    private EnvironmentRepository env;

    @Test
    public void testGetRepo() {
        assertEquals(1, 1);
    }

    @Test
    public void testGetURL(@Autowired WebTestClient client) {
        String resp = client
                .get()
                .uri("http://localhost:12345/app1/dev")
                .exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class)
                .returnResult()
                .getResponseBody();
        assertNotNull(resp);
    }

    @Test
    public void testSimpleWebTestClient(@Autowired WebTestClient client) {
        client.get().uri("http://localhost:12345/app1/dev").exchange().expectBody().jsonPath("propertySources").isArray();
        client.get().uri("http://localhost:12345/app1/dev").exchange().expectBody().jsonPath("propertySources[0].source.app-url").isEqualTo("www.dev.app1.ch");
    }
}