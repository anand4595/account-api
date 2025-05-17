package com.app.accounting.resource.controllers;

import com.app.accounting.commons.utils.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/resource")
public class Ping {

    @GetMapping("/ping")
    public PingResponse ping(){
        return PingResponse.builder()
                .version(Constants.Application.version)
                .name(Constants.Application.name)
                .time(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Data
    public static class PingResponse {
        private String version;
        private String name;
        private Timestamp time;
    }
}
