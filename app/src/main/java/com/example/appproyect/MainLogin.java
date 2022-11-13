package com.example.appproyect;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void Interfaces(View view) {
        Intent int2 = new Intent(MainLogin. this, MainPedidos.class);
        int2.putExtra("item2","Archivos");
        startActivity(int2);
    }
}