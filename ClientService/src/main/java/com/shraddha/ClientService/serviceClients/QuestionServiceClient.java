package com.shraddha.ClientService.serviceClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "questionService")
public interface QuestionServiceClient {

        @GetMapping("/api/question")
        String fetchQuestion();

}
