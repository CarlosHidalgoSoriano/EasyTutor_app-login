package cat.udl.amd.eztutor_login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import cat.udl.amd.eztutor_login.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    UserViewModel userViewModel;
    Button login;
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= findViewById(R.id.b_log);
        user= findViewById(R.id.et_user);
        pass= findViewById(R.id.et_pass);

        userViewModel = new UserViewModel(getApplication());

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _username= user.getText().toString();
                String _password= user.getText().toString();
                userViewModel.createTokenUser(_username,_password);

            }
        });

    }
}
