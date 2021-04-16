package com.example.ULAS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity  {

    private Button btn_timetable,btn_online,btn_library;
    private TextView timeV,dateV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        String args;
        time();


    }


    public void addListenerOnButton() {
        btn_timetable = (Button) findViewById(R.id.btn_timetable);
        btn_online = (Button) findViewById(R.id.btn_online);
        btn_library=(Button)findViewById(R.id.btn_library);

        btn_timetable.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".TimeTable");
                        try {
                            startActivity(intent);
                        }
                        catch (ActivityNotFoundException exception) {
                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        btn_online.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Online");
                        try {
                            startActivity(intent);
                        }
                        catch (ActivityNotFoundException exception) {
                            Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { Intent intent = new Intent(".Library");
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException exception) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void time()
    {

        timeV=(TextView)findViewById(R.id.textViewTime);
        dateV=(TextView)findViewById(R.id.textViewDate);
        // Текущее время
        Date currentDate = new Date();
// Форматирование времени как "день.месяц.год"
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
// Форматирование времени как "часы:минуты:секунды"
        DateFormat timeFormat = new SimpleDateFormat("HH.mm", Locale.getDefault());
        String timeText = timeFormat.format(currentDate);
        dateV.setText(dateText);
        timeV.setText(timeText);
        float timeTexts= Float.parseFloat(timeFormat.format(currentDate));



    }
    public void Notification()
    {


    }


}