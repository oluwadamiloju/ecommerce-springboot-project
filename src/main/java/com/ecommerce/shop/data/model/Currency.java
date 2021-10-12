package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"), GBP("British Pounds"),
    USD("United States Dollars"), GHC("Ghanaian Cedis"),
    FRF("Franc"), SGD("Singapore Dollar");

    private String name;
    Currency(String currencyName) {
        this.name = currencyName;
    }

    private String getName() {
        return name;
    }
}
