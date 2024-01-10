package com.example.resttemplatewebclient.api.apiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
        private List<Product> products;
        private int total;
        private int skip;
        private int limit;

    }
