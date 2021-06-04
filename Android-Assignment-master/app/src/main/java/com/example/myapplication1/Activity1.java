package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sample_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item1)
        {
            Intent intent = new Intent(Activity1.this,Activity1.class);
            startActivity(intent);
            return true;
        }
        else if(id == R.id.item2){
            Intent intent = new Intent(Activity1.this,Activity2.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}