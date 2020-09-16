package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create onItemClick listener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.list_options);
        String[] options = getResources().getStringArray(R.array.options);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(itemClickListener);
    }
}