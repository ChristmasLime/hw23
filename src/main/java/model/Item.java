package model;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private final List<Integer> itemsId;

    public Item() {
        this.itemsId = new ArrayList<>();
    }
    public void setItemsId(List<Integer> items) {
        for (Integer item : items) {
            itemsId.add(item);
        }
    }

    @Override
    public String toString() {
        return "В вашей корзине : " + itemsId.toString();
    }
}


