package com.ddd_bootcamp.domain.bank;

import java.util.UUID;

public class Account {
  private final UUID id;
  private Address address;

  public Account(Address address) {
    this.id = UUID.randomUUID();
    this.address = address;
  }

  public void updateAddress(Address newAddress) {
    this.address = newAddress;
  }
}
