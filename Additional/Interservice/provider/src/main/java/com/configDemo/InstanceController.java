package com.configDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class InstanceController {
    @Value("${server.port}")
    private String port;

    private final String instanceId = java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstanceInfo(){
        System.out.println("Request received on port : " + port);

        return ("Port is " + port + " and " + "Instance Id is : " + instanceId);
    }
}
