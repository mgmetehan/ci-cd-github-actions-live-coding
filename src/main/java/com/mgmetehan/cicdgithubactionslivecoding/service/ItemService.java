package com.mgmetehan.cicdgithubactionslivecoding.service;

import com.mgmetehan.cicdgithubactionslivecoding.dto.CreateItemDto;
import com.mgmetehan.cicdgithubactionslivecoding.model.Item;
import com.mgmetehan.cicdgithubactionslivecoding.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;


    public Item createItem(CreateItemDto dto) {
        return itemRepository.save(dto.toEntity(dto));
    }
}
