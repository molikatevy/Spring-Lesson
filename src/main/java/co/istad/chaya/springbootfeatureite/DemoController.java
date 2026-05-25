package co.istad.chaya.springbootfeatureite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Map;

@Slf4j
@RestController
public class DemoController {

    @Value("${myapp.info}")
    private String appInfo;

    @Value("${myapp.year}")
    private Integer year;

    @Value("${myapp.port}")
    private Integer port;

    @Value("${myapp.version}")
    private Integer appVersion;

    @GetMapping("/app")
    public Map<String, Serializable> getApp(){
        log.info("Test first log {}",appVersion);
        log.error("Test first error");
        log.warn("Test warn");
        return Map.of("Message","hello word",
                "Version",appVersion,
                "info",appInfo,
                "year",year,
                "port",port);
    }
}
