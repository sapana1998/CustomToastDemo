package com.e.customtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomToast(View view) {
        LayoutInflater inflater=getLayoutInflater();    //just like alert box inflater
        View appearance= inflater.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.root_layout));
        //viewGroup is group of all thinks together and in appearance the think are comes together
        Toast toast=new Toast(MainActivity.this);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0 ,0);

        toast.setView(appearance);

        toast.show();

    }

    public void iloveindia(View view) {
        Toast.makeText(getApplicationContext(), "hii i am sapana!!!", Toast.LENGTH_SHORT).show();//LENGTH_SHORT used displaying toast for short time duration
        //LENGTH_LONG used displaying toast for long time duration
    }
}
