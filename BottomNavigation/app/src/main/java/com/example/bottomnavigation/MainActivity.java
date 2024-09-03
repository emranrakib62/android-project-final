package com.example.bottomnavigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomNavigationView.getOrCreateBadge(R.id.notification).clearNumber();
            }
        });



        bottomNavigationView=findViewById(R.id.bottomNavigationView);

        bottomNavigationView.getOrCreateBadge(R.id.notification).setNumber(100);



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId()==R.id.home){
                    Toast.makeText(getApplicationContext(),"this is home",Toast.LENGTH_LONG).show();
                }

               else if(item.getItemId()==R.id.notification){
                    Toast.makeText(getApplicationContext(),"this is notification",Toast.LENGTH_LONG).show();
                }

                else if(item.getItemId()==R.id.profile){
                    Toast.makeText(getApplicationContext(),"this is profile",Toast.LENGTH_LONG).show();
                }
                    return true;
            }
        });



    }
}