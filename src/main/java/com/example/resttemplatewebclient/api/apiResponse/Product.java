package com.example.resttemplatewebclient.api.apiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private float discountPercentage;
    private Double rating;
    private Integer stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;
}
