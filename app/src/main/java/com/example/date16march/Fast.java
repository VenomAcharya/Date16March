package com.example.date16march;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.date16march.databinding.ActivityFastBinding;
import com.google.android.material.snackbar.Snackbar;

public class Fast extends AppCompatActivity {
    private ActivityFastBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFastBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn1.setOnClickListener(view -> {
            Std s = new Std("Bhagavat","bhagvat@lmail.com");
            binding.setObject(s);

        });
        binding.btn2.setOnClickListener(view -> {
            String s= binding.txt1.getText().toString();
            Intent i = new Intent(Fast.this,PassObject.class);
            i.putExtra("object",s);
            startActivity(i);
        });
    }
}