package co.uk.lgl.savelogcat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import co.uk.lgl.savelogcat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = this;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btn1 = findViewById(R.id.saveLogButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Logcat.Save(context);
            }
        });

        Button btn2 = findViewById(R.id.clrLogButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Logcat.Clear(context);
            }
        });
    }
}