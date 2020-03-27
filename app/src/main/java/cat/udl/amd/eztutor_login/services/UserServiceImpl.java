package cat.udl.amd.eztutor_login.services;

import cat.udl.amd.eztutor_login.dao.IUserDAO;
import cat.udl.amd.eztutor_login.dao.UserDAOImpl;
import retrofit2.Call;

public class UserServiceImpl implements UserServiceI {

    private IUserDAO userDAO = new UserDAOImpl();


    @Override
    public Call<Void> createTokenUser(String Auth){
        return userDAO.createTokenUser(Auth);
    }
}
