package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {

    Button button3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_second, container, false);
       button3=myview.findViewById(R.id.button3);

button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Toast.makeText(getActivity(),"hello",Toast.LENGTH_LONG).show();
    }
});


        return myview;
    }
}