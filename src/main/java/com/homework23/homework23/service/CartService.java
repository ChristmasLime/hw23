package com.homework23.homework23.service;


import java.util.List;

public interface CartService {

    void addItem(List<Integer> items);

    String getItemsJSON();

}


