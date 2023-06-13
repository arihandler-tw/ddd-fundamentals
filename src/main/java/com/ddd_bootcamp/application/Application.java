package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Price;
import com.ddd_bootcamp.domain.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone", new Price(1.0F));
        Item headphoneItem = new Item(headphone,1);
        cart.add(headphoneItem);

        Map<String, Price> competitorPrices = new HashMap<>();
        competitorPrices.put("Apple Pencil", new Price(1.0F));

        Price productPrice = competitorPrices.getOrDefault("Apple Pencil", new Price(1.0F));

        Product applePencil = new Product("Apple Pencil", productPrice);
        Item applePencilItem = new Item(applePencil, 2);


        cart.add(applePencilItem);

        cart.remove(headphone);

        System.out.println("--------------------------------------------------------");
        System.out.println("Cart = " + cart);
        List<Item> items = cart.getItems();
        System.out.println("--------------------------------------------------------");
        System.out.println("items = " + items);
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("removedProducts = " + cart.getRemovedProducts().getProducts());
        System.out.println("--------------------------------------------------------");
    }
}
