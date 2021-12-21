package com.example.reto2moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView usu = null;
    TextView contra = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login(View v){
        usu = findViewById(R.id.usu);
        contra = findViewById(R.id.contra);

            Intent i = new Intent(this, Mapa.class );
            startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.Registro) {
            Intent i = new Intent(this, Registrar.class );
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


}