package com.example.myactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu1 :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MenuFragment()).addToBackStack(null).commit();
                return true;

            case R.id.menu2 :
                Intent i = new Intent(MainActivity.this, MenuAcitivty.class);
                startActivity(i);
                return true;

            default:
                return true;

        }
    }
}