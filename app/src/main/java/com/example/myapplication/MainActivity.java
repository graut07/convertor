package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnclick(View view){
        EditText dolleramount=(EditText) findViewById(R.id.dollerAmount);
        String doller=dolleramount.getText().toString();
        Double d=Double.parseDouble(doller);

        Double dINR=0.013*d;
        String toaststring=" = "+ dINR.toString()+ "$";
        Toast.makeText(this,toaststring, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}