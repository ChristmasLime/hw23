package com.homework23.homework23.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class CartServiceImpl implements CartService {
    private final List<Integer> iD;

    public CartServiceImpl() {
        this.iD = new ArrayList<>();
    }

    public void addItem(List<Integer> itemIds) {
        iD.addAll(itemIds);
    }

    public String getItemsJSON() {
        return "Корзина с товаром : " + iD.toString() ;
    }
}

