package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.retrofit;

import retrofit2.Retrofit;

public class RetrofitInit {
    // 1 : Khởi tạo ra retrofit
    // 2 : Khởi tạo ra lớp interface request
    // 3 : Trả về kiểu dữ liệu chính lớp interface request
    // 4 : Không cho người khác có quyền khởi tạo ra lớp này

    private static Retrofit retrofit = null;

    private RetrofitInit(){

    }
    // ngươi dùng gọi phương thức này sẽ khởi tạo 2 thằng trên và trả về
    // interface request
    public static ApiRequest initApi(){
        if (retrofit == null){
            retrofit = getInstance();
        }
        return retrofit.create(ApiRequest.class);
    }

    private static Retrofit getInstance() {



        return retrofit;
    }

}
