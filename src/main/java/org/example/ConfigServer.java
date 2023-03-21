package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableAutoConfiguration
@SpringBootApplication
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class).
    }
}
