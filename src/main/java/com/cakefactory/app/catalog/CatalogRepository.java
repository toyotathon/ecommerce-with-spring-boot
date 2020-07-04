package com.cakefactory.app.catalog;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<Item, String> {

}