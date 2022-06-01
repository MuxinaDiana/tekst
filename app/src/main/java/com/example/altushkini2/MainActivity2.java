package com.example.altushkini2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button2;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button= (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }
    public void onClick (View view) {
        this.view = view;
        if (view.getId() == R.id.button) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            MainActivity2.this.startActivity(intent);
        }
        if (view.getId() == R.id.button2) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            MainActivity2.this.startActivity(intent);
        }
    }
}
