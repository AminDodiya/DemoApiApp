package demo.com.demoapp;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

 interface ApiInterface {

    @POST("/api/users")
    Call<User> getLoginResCall(@Body User user);

}