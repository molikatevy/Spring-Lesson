package co.istad.chaya.springbootfeatureite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class SpringBootFeatureIteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeatureIteApplication.class, args);
    }

}

