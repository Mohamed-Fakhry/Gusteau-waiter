package com.example.eastsound.remourasystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.eastsound.remourasystem.Service.SetupService;
import com.example.eastsound.remourasystem.model.account.User;
import java.util.ArrayList;
import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogIn extends AppCompatActivity {
    @Bind(R.id.userName)
    EditText userNameET;

    @Bind(R.id.password)
    EditText passwordET;

    @Bind(R.id.accountError)
    TextView erorrTV;

    ArrayList<User> acounts ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getAccounts();
    }

    private void getAccounts() {

        SetupService.getservice.getAccount().enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Call<ArrayList<User>> call, Response<ArrayList<User>> response) {
                Log.d("TEST","success");
                acounts = response.body();
            }

            @Override
            public void onFailure(Call<ArrayList<User>> call, Throwable t) {
                Log.d("TEST","Fail");
                t.printStackTrace();
            }
        });
    }

    public void logIn(View view){
        String name = userNameET.getText().toString();
        String password = passwordET.getText().toString();

        if(name != null && password != null){

            User waiter = new User();
            waiter.setName(name);
            waiter.setPassword(password);

            if(checkAccount(waiter)){
                Intent logINIntent = new Intent(this,MainPager.class);
                startActivity(logINIntent);
                finish();
            }
            else {
                erorrTV.setText("Username or Password not match");
            }
        }
    }

    private Boolean checkAccount(User waiter){
        for (User user : acounts){
            if(waiter.equals(user))
                return true;
        }
        return false;
    }
}