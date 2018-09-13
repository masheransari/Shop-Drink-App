package com.example.xudot.androiddrinkshop.Retrofit;

import com.example.xudot.androiddrinkshop.Model.CheckUserResponse;
import com.example.xudot.androiddrinkshop.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Xudot on 9/13/2018.
 */

public interface IDrinkShopApi {

    @FormUrlEncoded
    @POST("checkuser.php")
    Call<CheckUserResponse> checkUserResponseCall(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser(@Field("phone") String phone,
                               @Field("name") String name,
                               @Field("birthdate") String birthdate,
                               @Field("address") String address
    );
}
