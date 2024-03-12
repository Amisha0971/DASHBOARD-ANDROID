package com.example.androiddashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find each card by its ID
        CardView homeCard = findViewById(R.id.homeCard);
        CardView settingCard = findViewById(R.id.settingCard);
        CardView searchCard = findViewById(R.id.searchCard);
        CardView phoneCard = findViewById(R.id.phoneCard);
        CardView watchCard = findViewById(R.id.watchCard);
        CardView logoutCard = findViewById(R.id.logoutCard);

        // Set OnClickListener for each card
        homeCard.setOnClickListener(view -> {
            // Start HomeActivity when "Home" card is clicked
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });

        settingCard.setOnClickListener(view -> {
            // Start SettingActivity when "Setting" card is clicked
            Intent intent = new Intent(this, SettingActivity.class);
            startActivity(intent);
        });

        searchCard.setOnClickListener(view -> {
            // Start SearchActivity when "Search" card is clicked
            Intent intent = new Intent(this, SearchActivity.class);
            startActivity(intent);
        });

        phoneCard.setOnClickListener(view -> {
            // Start PhoneActivity when "Phone" card is clicked
            Intent intent = new Intent(this, PhoneActivity.class);
            startActivity(intent);
        });

        watchCard.setOnClickListener(view -> {
            // Start WatchActivity when "Watch" card is clicked
            Intent intent = new Intent(this, WatchActivity.class);
            startActivity(intent);
        });

        logoutCard.setOnClickListener(view -> {
            // Start LogoutActivity when "Logout" card is clicked
            Intent intent = new Intent(this, LogoutActivity.class);
            startActivity(intent);
        });
    }
}
