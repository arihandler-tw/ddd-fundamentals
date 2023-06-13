package com.ddd_bootcamp.domain.bank.domain_service;

import com.ddd_bootcamp.domain.bank.Address;
import com.ddd_bootcamp.domain.bank.Customer;

public class CustomerAddressUpdater {
  public void updateAddress(Customer customer, Address newAddress) {
    customer.updateAddress(newAddress);
    customer.getAccounts().forEach(account -> account.updateAddress(newAddress));
  }
}
