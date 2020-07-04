package com.cakefactory.app.catalog.persistence;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalog")
class ItemEntity {
  @Id
  String sku;

  String title;

  BigDecimal price;

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ItemEntity) {
      ItemEntity other = (ItemEntity) obj;
      return Objects.equals(this.sku, other.sku);
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.sku);
  }
}