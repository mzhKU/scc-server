package ch.mzh;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Data
public class ConfigProperties {

    private String hostName;
    private int port;
    private String from;
}
