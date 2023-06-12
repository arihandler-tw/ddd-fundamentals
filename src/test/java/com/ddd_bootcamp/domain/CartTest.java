package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddItemToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product");
        Item item = new Item(product, 1);
        cart.add(item);

        List<Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());

    }
}