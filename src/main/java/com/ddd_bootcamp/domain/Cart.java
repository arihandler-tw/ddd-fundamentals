package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
  private List<Item> items = new ArrayList<>();
  private final RemovedProducts removedProducts = new RemovedProducts();

  public void add(Item item) {
    items.add(item);
  }

  public List<Item> getItems() {
    return items;
  }

  @Override
  public String toString() {
    return "Cart{" +
        "items=" + items +
        '}';
  }


  public void remove(Product product) {
    this.items = items.stream().filter(item -> item.getProduct() != product).collect(Collectors.toList());
    this.removedProducts.add(product.getName());
  }

  public RemovedProducts getRemovedProducts() {
    return removedProducts;
  }
}