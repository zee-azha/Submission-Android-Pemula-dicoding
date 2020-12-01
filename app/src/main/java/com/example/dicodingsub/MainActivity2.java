package com.example.dicodingsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);

        Currency currency = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (currency != null) {
            Glide.with(this)
                    .load(currency.getImg())
                    .into(imgItemPhoto);
            tvName.setText(currency.getUang());
            tvDeskripsi.setText(currency.getDetail());

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Mata uang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}