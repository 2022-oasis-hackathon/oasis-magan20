package com.example.oasis_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SiteActivity extends AppCompatActivity {

    private Button home_button, ticket_button, site_button, myinfo_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SiteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ticket_button = findViewById(R.id.ticket_button);
        ticket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SiteActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });

        site_button = findViewById(R.id.site_button);
        site_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SiteActivity.this, SiteActivity.class);
                startActivity(intent);
            }
        });

        myinfo_button = findViewById(R.id.myinfo_button);
        myinfo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SiteActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

    }
}