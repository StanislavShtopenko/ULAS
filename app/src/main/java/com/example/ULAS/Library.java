package com.example.ULAS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity {
private Button bnt_assembler_lib,bnt_database_lib,bnt_java_lib,bnt_algorithms_lib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        addListenerOnButton();
    }
    //https://drive.google.com/file/d/1WSJ536o3bpUzh8luYZSDga7jLhfm2ioU/view?usp=sharing
    public void addListenerOnButton() {

        bnt_assembler_lib=(Button)findViewById(R.id.assembler);
        bnt_algorithms_lib=(Button)findViewById(R.id.algorithms);
        bnt_database_lib=(Button)findViewById(R.id.database);
        bnt_java_lib=(Button)findViewById(R.id.java);

        bnt_assembler_lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/u/0/uc?id=1WSJ536o3bpUzh8luYZSDga7jLhfm2ioU&export=download"));
                startActivity(browserIntent);
            }
        });
        bnt_algorithms_lib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}