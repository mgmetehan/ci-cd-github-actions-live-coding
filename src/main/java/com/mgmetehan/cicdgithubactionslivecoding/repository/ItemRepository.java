package com.mgmetehan.cicdgithubactionslivecoding.repository;

import com.mgmetehan.cicdgithubactionslivecoding.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
