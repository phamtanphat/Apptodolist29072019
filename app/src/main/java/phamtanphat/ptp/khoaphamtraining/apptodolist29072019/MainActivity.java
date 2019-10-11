package phamtanphat.ptp.khoaphamtraining.apptodolist29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.LoginResponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.helper.Loading;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.viewmodel.MainViewModel;


public class MainActivity extends AppCompatActivity {

    MainViewModel mMainViewModel;
    ProgressBar progressBar;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainViewModel = new MainViewModel();
        progressBar =findViewById(R.id.progressbar);
        btnLogin = findViewById(R.id.buttonLogin);

        progressBar.setVisibility(View.GONE);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainViewModel
                        .onValidLogin("phat","123" , new Loading(progressBar))
                        .observe(MainActivity.this, new Observer<LoginResponse>() {
                            @Override
                            public void onChanged(LoginResponse loginResponse) {
                                if (loginResponse != null){
                                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });


        //regex

//        Patterns.EMAIL_ADDRESS.matcher();
//        Patterns.EMAIL_ADDRESS.matcher();

//        android studio install google service

    }
}
