package cat.udl.amd.eztutor_login.services;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserServiceI {

    @POST("account/create_token")
    Call<Void> createTokenUser(@Header("Authorization") String auth);

}
