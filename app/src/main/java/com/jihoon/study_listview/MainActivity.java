package com.jihoon.study_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU);

        ListView listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);


        // ListView에 Click 이벤트에 대한 리스너 설정.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // TODO : 파라미터에 대해서 찾아보기
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // get TextView's Text
                String strText = (String) parent.getItemAtPosition(position);

                // TODO : use strText
                Toast.makeText(getApplicationContext(), strText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}