package com.ddd_bootcamp.domain.bank;

import java.util.List;
import java.util.UUID;

public class Customer {

  private final UUID id;
  private Address address;
  private final List<Account> accounts;

  public Customer(Address address, List<Account> accounts) {
    this.id = UUID.randomUUID();
    this.address = address;
    this.accounts = accounts;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void updateAddress(Address newAddress) {
    this.address = newAddress;
  }
}
