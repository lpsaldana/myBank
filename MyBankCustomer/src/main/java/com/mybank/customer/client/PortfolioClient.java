package com.mybank.customer.client;

import com.mybank.customer.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-mb-customer-portfolio", url = "localhost:9080/api/account")
public interface PortfolioClient {
    @GetMapping("/customer-acc/{id}")
    List<AccountDTO> findAllCustomerAccounts(@PathVariable Long id);
}
