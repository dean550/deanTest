package com.example.administrator.mysnackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtSnackbar;
    private Button btnShowSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSnackbar = (TextView) findViewById(R.id.txtSnackbar);
        btnShowSnackbar = (Button) findViewById(R.id.btn_snack_bar);
        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar =  Snackbar.make(txtSnackbar,"Snackbar Clicked",Snackbar.LENGTH_LONG).setAction("Clicked",new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        txtSnackbar.setText("Snackbar Clicked");
                    }
                });
                snackBar.getView().setBackgroundColor(0xfff44336);
                snackBar.show();
            }
        });
    }
}
