package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerce.adapter.CategoryAdapter;

import java.util.Objects;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = this.findViewById(R.id.toolbar_category);

        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String title = intent.getStringExtra(CategoryAdapter.TITLE_INTENT_EXTRA);

        getSupportActionBar().setTitle(title);

        toolbar.setNavigationOnClickListener(view -> this.finish());
    }

}
