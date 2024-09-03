package com.example.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        /*
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        FragmentManager fmanager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fmanager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout,new Firstfragment() );
        fragmentTransaction.commit();
    }
});

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fmanager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fmanager.beginTransaction();
                fragmentTransaction.add(R.id.framelayout,new SecondFragment() );
                fragmentTransaction.commit();
            }
        });

*/










    }
}