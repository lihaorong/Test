package com.example.lenovo.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewTest extends AppCompatActivity {
    private String[] data = {"Apple","Banana","Orange","Watermelon",
        "Pear","Grape","Pineapple","Strawberry","Chery","Mango",
            "Apple","Banana","Orange","Watermelon", "Pear","Grape",
            "Pineapple","Strawberry","Chery","Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ListViewTest.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
