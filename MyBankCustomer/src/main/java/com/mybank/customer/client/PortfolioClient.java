package com.mybank.customer.client;

import com.mybank.customer.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-mb-customer-portfolio", url = "localhost:8082/api/account")
public interface PortfolioClient {
    @GetMapping("/person-acc/{id}")
    List<AccountDTO> findAllPersonAccounts(@PathVariable Long id);
}