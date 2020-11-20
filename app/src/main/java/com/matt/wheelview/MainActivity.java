package com.matt.wheelview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.matt.mywheelview.MyWheelView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyWheelView myWheelView = findViewById(R.id.myWheelView);
        myWheelView.setItemsVisibleCount(5);

        List mOptionsItems = new ArrayList<>();
        for (int i = -5; i <= 5; i++) {
            mOptionsItems.add(String.valueOf(i));
        }
        myWheelView.setItems(mOptionsItems);
        myWheelView.setTextSize(32);
        myWheelView.setOnItemSelectedListener(index -> {
            Toast.makeText(this, "选中：" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
        });
    }
}