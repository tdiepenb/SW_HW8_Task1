package de.uni.koeln.sse.se;

import java.util.ArrayList;

public class ShoppingBasket {
    public static Items item_list = new Items();
    private static Integer totalPrice = 0;
    ArrayList<String> MyItems = new ArrayList();

    public ShoppingBasket() {
    }

    public void addTobasket(String item) {
        this.setTotalPrice(this.getTotalPrice() + item_list.getPrice(item));
    }

    public Integer getBill() {
        return this.getTotalPrice();
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        ShoppingBasket.totalPrice = totalPrice;
    }
}
