package com.ddd_bootcamp.domain;

import java.util.Currency;

public class Price {
  private final float amount;
  private final Currency currency;

  public Price(float amount) {
    this.amount = amount;
    this.currency = java.util.Currency.getInstance("USD");
  }

  public float getAmount() {
    return amount;
  }

  public Price reduceByPercent(int percentage) {
    return new Price(amount - amount / percentage);
  }

  @Override
  public String toString() {
    return "Price{" +
        "amount=" + amount +
        ", currency=" + currency +
        '}';
  }


}
