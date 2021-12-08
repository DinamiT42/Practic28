package com.example.pr28nd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }
}
