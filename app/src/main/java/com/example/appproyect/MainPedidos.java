package com.example.appproyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pedidos);
        Toolbar mytoolbar = findViewById(R.id.mytoolbar);
        mytoolbar.setTitle("");
        setSupportActionBar(mytoolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2: Intent int1 = new Intent(MainPedidos. this, Entregados.class);
                startActivity(int1);
                return true;
            case R.id.item1: Intent int2 = new Intent(MainPedidos. this, Productos.class);
                startActivity(int2);
                return true;
            case R.id.item3: Intent int3 = new Intent(MainPedidos. this, MainLogin.class);
                startActivity(int3);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}