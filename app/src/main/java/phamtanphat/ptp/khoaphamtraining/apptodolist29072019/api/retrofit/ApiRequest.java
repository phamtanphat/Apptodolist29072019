package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {


    @GET("connect.php")
    Call<String> getConnect();
}
