package com.juaracoding.absensifrontend.service;

import com.juaracoding.absensifrontend.entity.Userlogin;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserInterface {
    @POST("/userlogin")
    Call<ResponseBody> checkuser(@Body Userlogin userlogin);
}
