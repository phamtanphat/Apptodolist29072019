package phamtanphat.ptp.khoaphamtraining.apptodolist29072019.helper;

import android.view.View;
import android.widget.ProgressBar;

public class Loading {
    private ProgressBar progressBar;

    public Loading(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void setLoading(ProgressBar progressBar){
        this.progressBar = progressBar;
    }

    public void showLoading(){
        progressBar.setVisibility(View.VISIBLE);
    }
    public void hideLoading(){
        progressBar.setVisibility(View.GONE);
    }

}
