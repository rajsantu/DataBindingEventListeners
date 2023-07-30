package com.mainpackage.databindingeventlistners;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Person person1 = new Person("xyz", "xyz123@email.com");

        // TextView
        com.mainpackage.databindingeventlistners.databinding.ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(person1);

        // Binding the Handler
        MainActivityClickHandlers clickHandler = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandler(clickHandler);


    }


    public static class MainActivityClickHandlers {
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        // First Button Click Handling
        public void onButton1Click() {
            Toast.makeText(context, "Hello Friends", Toast.LENGTH_SHORT).show();
        }


        // Second Button CLick Handling
        public void onButton2Click() {
            Toast.makeText(context, "Bye Friends", Toast.LENGTH_SHORT).show();
        }


    }


}