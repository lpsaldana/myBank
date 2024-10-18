package com.mybank.customer.http.responses;

import com.mybank.customer.dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonAccountsResponse {
    private List<AccountDTO> accountDTOList;
}
