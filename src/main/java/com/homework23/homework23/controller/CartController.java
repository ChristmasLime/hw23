package com.homework23.homework23.controller;

import com.homework23.homework23.service.CartService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam("itemId") List<Integer> itemId) {
        cartService.addItem(itemId);
        return "Товар добавлен " + itemId.toString();
    }

    @GetMapping("/get")
    public String getItems() {
        return cartService.getItemsJSON();
    }
}