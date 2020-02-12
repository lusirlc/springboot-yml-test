package pers.luchuan.yml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pers.luchuan.yml.properties.MyProperties;

@SpringBootApplication
@EnableConfigurationProperties({MyProperties.class})
public class YmlApplication {
    public static void main(String[] args) {
        SpringApplication.run(YmlApplication.class, args);
    }
}
