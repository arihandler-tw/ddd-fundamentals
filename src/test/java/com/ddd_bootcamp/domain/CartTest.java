package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddItemToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product", new Price(1.0F));
        Item item = new Item(product, 1);
        cart.add(item);

        List<Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getProduct().getName());
        assertEquals(1.0F, actual.get(0).getProduct().getPrice().getAmount());

    }

    @Test
    void shouldRemoveProductFromCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product", new Price(1.0F));
        Item item = new Item(product, 1);
        cart.add(item);
        Product otherProduct = new Product("Other test product", new Price(1.0F));
        Item otherItem = new Item(otherProduct, 1);
        cart.add(otherItem);

        cart.remove(product);

        List<Item> actual = cart.getItems();

        assertEquals(1, actual.size());
        assertEquals("Other test product", actual.get(0).getProduct().getName());
    }
}