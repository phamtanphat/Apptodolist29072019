package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("iduser")
    @Expose
    private String iduser;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

}