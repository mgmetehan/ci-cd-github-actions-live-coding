package com.mgmetehan.cicdgithubactionslivecoding.dto;

import com.mgmetehan.cicdgithubactionslivecoding.model.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateItemDto {
    private String name;
    private Double price;
    private String brand;
    private String category;

    public Item toEntity(CreateItemDto dto) {
        return Item.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .brand(dto.getBrand())
                .category(dto.getCategory())
                .build();
    }
}
