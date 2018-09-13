package com.example.xudot.androiddrinkshop.Utils;

import com.example.xudot.androiddrinkshop.Retrofit.IDrinkShopApi;
import com.example.xudot.androiddrinkshop.Retrofit.RetrofitClient;

/**
 * Created by Xudot on 9/13/2018.
 */

public class Common {
    //in emulator, localhost=10.0.2.2
//    private static final String BASE_URL = "http://localhost/drinkshop";
    private static final String BASE_URL = "http://10.0.2.2/drinkshop";

    public static IDrinkShopApi getApi() {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopApi.class);
    }
}
