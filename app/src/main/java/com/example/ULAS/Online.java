package com.example.ULAS;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Online extends AppCompatActivity {
    private Button bnt_assembler,bnt_database,bnt_algorithms,bnt_java,bnt_osn_energy_safe,bnt_ecologetick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        addListenerOnButton();


    }
    public void addListenerOnButton(){
        bnt_assembler=(Button) findViewById(R.id.btn_zoom_assembler);
        bnt_database =(Button) findViewById(R.id.btn_zoom_database);
        bnt_algorithms = (Button) findViewById(R.id.btn_zoom_algorithms);
        bnt_java = (Button) findViewById(R.id.btn_googlemeet_java);
        bnt_osn_energy_safe=(Button) findViewById(R.id.btn_zoom_osneng);
        bnt_ecologetick = (Button) findViewById(R.id.btn_zoom_ecologetick);

        bnt_assembler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://zoom.us/j/8321341131?pwd=TkZBRUVoRFJvWlNMcHZpbUhicUVDZz09"));
                startActivity(browserIntent);
            }
        });

        bnt_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new
                        Intent(Intent.ACTION_VIEW,Uri.parse("https://us04web.zoom.us/j/75380552689?pwd=bDVsTXllS0lITllnVDRiNlp6N3VFQT09"));
                startActivity(browserIntent);
            }
        });

        bnt_algorithms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://zoom.us/j/8321341131?pwd=TkZBRUVoRFJvWlNMcHZpbUhicUVDZz09"));
                startActivity(browserIntent);
            }
        });

        bnt_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/lookup/epfsr7ncy3"));
                startActivity(browserIntent);
            }
        });

        bnt_osn_energy_safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://us04web.zoom.us/j/76233962408?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09"));
                startActivity(browserIntent);
            }
        });

        bnt_ecologetick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW,Uri.parse("https://us04web.zoom.us/j/76233962408?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09"));
                 startActivity(browserIntent);
            }
        });

    }
}