package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response.LoginResponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.helper.Loading;
import phamtanphat.ptp.khoaphamtraining.apptodolist29072019.respository.LoginRepository;

public class MainViewModel extends ViewModel {

    private LoginRepository repository = LoginRepository.getInstance();


    public MutableLiveData<LoginResponse> onValidLogin(String username , String password , Loading loading){
        return repository.checkLogin(username,password,loading);
    }


}
