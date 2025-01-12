package com.example.shop.api.data;

import com.example.shop.api.TestBaseApi;
import com.example.shop.api.models.AddShopRequest;
import com.github.javafaker.Faker;

public class DataGenerator extends TestBaseApi {

    public static AddShopRequest addShop() {
        Faker faker = new Faker();
        String shopName = faker.name().username();

        return AddShopRequest.builder()
                .shopName("A"+shopName)
                .shopPublic(false)
                .build();
    }

}
