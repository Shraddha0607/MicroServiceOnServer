package com.shraddha.ClientService.serviceClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="certificateService")
// as no url needed, it will fetch from server on the basis of service name
public interface CertificateServiceClient {

    @GetMapping("/api/certificate")
    String fetchCertificate();
}

