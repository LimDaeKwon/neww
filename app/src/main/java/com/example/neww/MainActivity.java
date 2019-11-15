package com.example.neww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.setting :
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
                break;
            case R.id.imageView_search :
                Intent intentS = new Intent(getApplicationContext(), Search.class);
                startActivity(intentS);
                break;


        }
    }
}
