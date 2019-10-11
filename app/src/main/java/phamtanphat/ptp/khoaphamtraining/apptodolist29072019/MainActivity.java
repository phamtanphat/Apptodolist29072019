package phamtanphat.ptp.khoaphamtraining.apptodolist29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.LoginResponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.viewmodel.MainViewModel;


public class MainActivity extends AppCompatActivity {

    MainViewModel mMainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainViewModel = new MainViewModel();
        mMainViewModel
                .onValidLogin("phat","123")
                .observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                if (loginResponse != null){

                }
            }
        });

        //regex

//        Patterns.EMAIL_ADDRESS.matcher();
//        Patterns.EMAIL_ADDRESS.matcher();

//        android studio install google service

    }
}
