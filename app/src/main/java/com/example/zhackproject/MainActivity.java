package com.example.zhackproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mental Health Services button
        Button MentalHealthServiceActivityBtn = (Button) findViewById(R.id.mentalhealthBtn);
        MentalHealthServiceActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent StartIntent = new Intent(getApplicationContext(),MentalHealthServicesActivity.class);
                 startActivity(StartIntent);
            }




        });

        // Women services button
        Button WomenHealthServicesActivityBtn = (Button) findViewById(R.id.womenHealthsServicesBtn);
        WomenHealthServicesActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent womenhs = new Intent(getApplicationContext(), WomenHealthServicesActivity.class);
                startActivity(womenhs);

            }
        });

        //Shelter Services Button
        final Button ShelterServicesActivityBtn = (Button) findViewById(R.id.shelterServicesBtn);
        ShelterServicesActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shelterhs = new Intent(getApplicationContext(),ShelterServicesActivity.class);
                startActivity(shelterhs);


            }
        });

        //Child Services Button
        final Button ChildServicesActivityBtn =(Button) findViewById(R.id.childServicesBtn);
        ChildServicesActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childhs = new Intent(getApplicationContext(),ChildServiceActivity.class);
                startActivity(childhs);
            }
        });

        //Food Services app
        final Button FoodServicesActivity = (Button) findViewById(R.id.foodServicesBtn);
        FoodServicesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Foodservices = new Intent(getApplicationContext(),FoodServicesActivity.class);
                startActivity(Foodservices);

            }
        });

        final Button ElderServicesActivity = (Button) findViewById(R.id.elderlyServicesBtn);
        ElderServicesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ElderlyServices = new Intent(getApplicationContext(), ElderServicesActivity.class);
                startActivity(ElderlyServices);

            }
        });


    }
}