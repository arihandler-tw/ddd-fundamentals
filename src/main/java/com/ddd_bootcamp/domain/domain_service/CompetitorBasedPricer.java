package com.ddd_bootcamp.domain.domain_service;

import com.ddd_bootcamp.domain.Price;

import java.util.HashMap;
import java.util.Map;

public class CompetitorBasedPricer {
  static Map<String, Price> competitorPrices = new HashMap<>();
  private static final int discountPercentage = 10;

  static {
    competitorPrices.put("Apple Pencil", new Price(100.0F));
    competitorPrices.put("Sony Wireless headphone", new Price(10.0F));
  }

  public static Price getPrice(String productName) {
    Price price = competitorPrices.get(productName);
    return price.reduceByPercent(discountPercentage);
  }
}
