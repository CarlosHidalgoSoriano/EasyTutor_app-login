package cat.udl.amd.eztutor_login.dao;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface IUserDAO {

    @POST("account/create_token")
    Call<Void> createTokenUser(@Header("Authorization") String auth);
}
