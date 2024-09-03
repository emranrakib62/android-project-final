package com.example.navigationdrawyer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
MaterialToolbar toolbar;

NavigationView navigationview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        drawerLayout=findViewById(R.id.drawyerlayout);
        toolbar=findViewById(R.id.toolbar);

        navigationview=findViewById(R.id.navigationview);


        FragmentManager fmanager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fmanager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout,new FirstFragment());
        fragmentTransaction.commit();





        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(

                MainActivity.this,drawerLayout,toolbar,R.string.drawer_close,R.string.drawer_open

        );

        drawerLayout.addDrawerListener(toggle);


       toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {
               if(item.getItemId()==R.id.share){
                   Toast.makeText(MainActivity.this,"share",Toast.LENGTH_LONG).show();
               }
               return false;
           }
       });





        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId()==R.id.DSE){
                    //Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_LONG).show();

                    FirstFragment.WEB_URL="https://www.dse.com.bd/latest_share_price_scroll_l.php";


                    FragmentManager fmanager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fmanager.beginTransaction();
                    fragmentTransaction.add(R.id.framelayout,new FirstFragment());
                    fragmentTransaction.commit();

                    drawerLayout.closeDrawer(GravityCompat.START);

                }

               else if(item.getItemId()==R.id.CSE){
                    //Toast.makeText(MainActivity.this,"profile",Toast.LENGTH_LONG).show();

                    FirstFragment.WEB_URL="https://www.cse.com.bd/";

                    FragmentManager fmanager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fmanager.beginTransaction();
                    fragmentTransaction.add(R.id.framelayout,new FirstFragment());
                    fragmentTransaction.commit();
                    drawerLayout.closeDrawer(GravityCompat.START);

               }

                else if(item.getItemId()==R.id.notification){
                    Toast.makeText(MainActivity.this,"notification",Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if(item.getItemId()==R.id.Setting){
                    Toast.makeText(MainActivity.this,"Setting",Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });

    }









}