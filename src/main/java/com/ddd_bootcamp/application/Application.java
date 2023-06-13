package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.*;
import com.ddd_bootcamp.domain.domain_service.CompetitorBasedPricer;

public class Application {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");

        Price applePencilPrice = CompetitorBasedPricer.getPrice("Apple Pencil");

        System.out.println("Discounted Price for Apple Pencil: " + applePencilPrice);

        Price sonyWirelessHeadphonePrice = CompetitorBasedPricer.getPrice("Sony Wireless headphone");

        System.out.println("Discounted Price for Sony Wireless headphone: "
            + sonyWirelessHeadphonePrice);

        System.out.println("-------------------------------------------------------------------");

        Cart cart = new Cart();

        cart.add(new Item( new Product("Apple Pencil",applePencilPrice), 1));
        cart.add(new Item( new Product("Sony Wireless headphone",sonyWirelessHeadphonePrice), 2));

        System.out.println("cart = " + cart);

        // Check-out marks the cart as checked out ?
        var orderProducts = cart.checkOut();
        var order = new Order(orderProducts);
        System.out.println(order);
    }
}
