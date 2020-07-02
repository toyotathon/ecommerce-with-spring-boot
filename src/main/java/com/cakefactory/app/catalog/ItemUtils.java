package com.cakefactory.app.catalog;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ItemUtils {
  static List<Item> getBaseItems() {
    return Arrays.asList(new Item("item 1", new BigDecimal("1.81")), new Item("item 2", new BigDecimal("2.50")),
        new Item("item 3", new BigDecimal("2.50")), new Item("item 4", new BigDecimal("2.50")),
        new Item("item 5", new BigDecimal("2.50")), new Item("item 6", new BigDecimal("2.50")),
        new Item("item 7", new BigDecimal("2.50")));
  }
}