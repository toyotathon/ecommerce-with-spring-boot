package com.cakefactory.app.catalog.persistence;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.cakefactory.app.catalog.CatalogService;
import com.cakefactory.app.catalog.Item;

import org.springframework.stereotype.Component;

@Component
public class JpaCatalogService implements CatalogService {
  private final ItemRepository itemRepository;

  JpaCatalogService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @Override
  public Iterable<Item> getItems() {
    return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
        .map(entity -> new Item(entity.title, entity.price)).collect(Collectors.toList());
  }

}