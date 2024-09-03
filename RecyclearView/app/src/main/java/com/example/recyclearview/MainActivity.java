package com.example.recyclearview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

Myadapter adapter=new Myadapter();
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    //...................................................................


   private class Myadapter extends  RecyclerView.Adapter<Myadapter.myviewholder>{


       private  class myviewholder extends RecyclerView.ViewHolder{

           ImageView imageView;
           TextView textView;

           public myviewholder(@NonNull View itemView) {
               super(itemView);
               imageView=itemView.findViewById(R.id.imageView);
               textView=itemView.findViewById(R.id.textView);


           }
       }





       @NonNull
       @Override
       public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           LayoutInflater inflater=getLayoutInflater();
           View myView=inflater.inflate(R.layout.recycle_item,parent,false);
           return new myviewholder(myView);
       }

       @Override
       public void onBindViewHolder(@NonNull myviewholder holder, int position) {


           holder.textView.setText("Item  position:"+position);
       }

       @Override
       public int getItemCount() {
           return 10;
       }




   }

}