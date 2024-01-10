package com.example.resttemplatewebclient.api.config;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiConfig<T> {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public PagedListHolder<T> pagedListHolder(){
        PagedListHolder<T> pagedListHolder = new PagedListHolder<>();
        pagedListHolder.setPageSize(6);
        return pagedListHolder;
    }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
