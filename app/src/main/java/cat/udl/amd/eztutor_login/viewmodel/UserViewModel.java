package cat.udl.amd.eztutor_login.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import cat.udl.amd.eztutor_login.services.UserServiceI;
import cat.udl.amd.eztutor_login.services.UserServiceImpl;

public class UserViewModel extends AndroidViewModel {
    private UserServiceI repository;

    public UserViewModel(Application application) {
        super(application);
        repository = new UserServiceImpl();



    }

    public void createTokenUser(String user, String pass){
        String header= "Token 34" + user + ":" + pass;
        this.repository.createTokenUser(header);
    }

}
