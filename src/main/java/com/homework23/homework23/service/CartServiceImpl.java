package com.homework23.homework23.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class CartServiceImpl implements CartService {
    private final List<Integer> items;

    public CartServiceImpl() {
        this.items = new ArrayList<>();
    }

    public void addItem(List<Integer> itemIds) {
        items.addAll(itemIds);
    }

    public String getItemsJSON() {
        return "Корзина с товаром : " + items.toString() ;
    }
}

