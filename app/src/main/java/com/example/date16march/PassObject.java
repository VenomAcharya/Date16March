package com.example.date16march;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.date16march.databinding.ActivityPassObjectBinding;

public class PassObject extends AppCompatActivity {
    private ActivityPassObjectBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPassObjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent i = getIntent();
        String s = i.getStringExtra("object");



    }
}