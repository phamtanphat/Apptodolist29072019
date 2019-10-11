package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.respository;

import android.database.Observable;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ProgressBar;

import androidx.lifecycle.MutableLiveData;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.LoginResponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit.ApiRequest;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit.RetrofitInit;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.helper.Loading;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {

    private static LoginRepository repository = null;
    private ApiRequest apiRequest;
    private LoginRepository() {
        apiRequest = RetrofitInit.initApi();
    }
//
    public synchronized static LoginRepository getInstance(){
        if (repository == null){
            repository = new LoginRepository();
        }
        return repository;
    }


    public MutableLiveData<LoginResponse> checkLogin(final String username , final String password , final Loading loading){
        final MutableLiveData<LoginResponse> loginResponse = new MutableLiveData<>();
        loading.showLoading();
        CountDownTimer countDownTimer = new CountDownTimer(2000,2000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                apiRequest.onLoginResult(username , password).enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        loginResponse.postValue(response.body());
                        loading.hideLoading();
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        loading.hideLoading();
                    }
                });
            }
        };
        countDownTimer.start();

        return loginResponse;
    }
}
