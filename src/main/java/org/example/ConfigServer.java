package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableAutoConfiguration
@SpringBootApplication
@Slf4j
public class ConfigServer {
    public static void main( String[] args ) {
        new SpringApplicationBuilder(ConfigServer.class)
                .run(args);
    }
}
