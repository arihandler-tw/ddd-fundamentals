package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class RemovedProducts {
  private final List<String> products = new ArrayList<>();
  public void add(String productName) {
    products.add(productName);
  }

  public List<String> getProducts() {
    return products;
  }
}
