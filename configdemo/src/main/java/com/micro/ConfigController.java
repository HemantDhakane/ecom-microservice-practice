package com.micro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${build.id}")
    private String id;

    @Value("${build.name}")
    private String name;

    @Value("${build.version}")
    private String version;

    @Value("${build.type}")
    private String type;

    @GetMapping("/config")
    public String getConfig(){
        return ("Id: " + id + ", Name: " + name + ", Version: "+ version + ", Type: " + type);
    }
}
