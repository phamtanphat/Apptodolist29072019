package phamtanphat.ptp.khoaphamtraining.apptodolist29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;

import org.w3c.dom.Text;

import java.util.regex.Pattern;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit.RetrofitInit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //regex

//        Patterns.EMAIL_ADDRESS.matcher();
//        Patterns.EMAIL_ADDRESS.matcher();

        RetrofitInit.initApi().getConnect().enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}
