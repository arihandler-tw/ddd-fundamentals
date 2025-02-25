package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class Cart {
  private final UUID id;
  private List<Item> items;

  private final RemovedProducts removedProducts;
  private boolean checkedOut;

  public Cart() {
    id = UUID.randomUUID();
    items = new ArrayList<>();
    removedProducts = new RemovedProducts();
    checkedOut = false;
  }

  public void add(Item item) {
    items.add(item);
  }

  public List<Item> getItems() {
    return items;
  }


  public void remove(Product product) {
    this.items = items.stream().filter(item -> item.getProduct() != product).collect(Collectors.toList());
    this.removedProducts.add(product.getName());
  }

  public RemovedProducts getRemovedProducts() {
    return removedProducts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cart cart = (Cart) o;
    return Objects.equals(id, cart.id);
  }

  @Override
  public String toString() {
    return "Cart{" +
        "items=" + items +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public List<Product> checkOut() {
    checkedOut = true;
    return items.stream().flatMap(item -> {
      List<Product> flattenProducts = new ArrayList<>();
      for (int j = 0; j < item.getQuantity(); j++) {
        flattenProducts.add(item.getProduct());
      }
      return flattenProducts.stream();
    }).toList();
  }
}