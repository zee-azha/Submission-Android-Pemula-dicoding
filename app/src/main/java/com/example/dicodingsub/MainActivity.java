package com.example.dicodingsub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private RecyclerView rvCurrency;
    private ArrayList<Currency> list = new ArrayList<>();
    ImageView img;
    TextView name,detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCurrency = findViewById(R.id.rv_Currency);
        rvCurrency.setHasFixedSize(true);
        loadFragment(new Home());
        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.nav_view);
        navigation.setOnNavigationItemSelectedListener(this);
        Menu menu = navigation.getMenu();
        MenuItem menuItem =menu.getItem(0);
        menuItem.setChecked(true);
        img = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);
        list.addAll(CurrencyData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvCurrency.setLayoutManager(new LinearLayoutManager(this));
        ListCurrencyAdapter listAdapter = new ListCurrencyAdapter(list);
        rvCurrency.setAdapter(listAdapter);
        listAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Currency currency) {
                Intent moveIntent1 = new Intent(MainActivity.this, MainActivity2.class);
                moveIntent1.putExtra(MainActivity2.ITEM_EXTRA, currency);
                startActivity(moveIntent1);
            }
        });
    } private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container,fragment )
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.action_home:
                fragment = new Home();

                break;

            case R.id.action_about:

                fragment = new About();
                Intent actexpense = new Intent(MainActivity.this,AboutMe.class);
                startActivity(actexpense);
                finish();
                break;


        }

        return loadFragment(fragment);
    }



}