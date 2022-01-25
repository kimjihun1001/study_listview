package com.jihoon.study_listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter 달기
        listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        // 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.heart), "first", "This is first");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.heart), "second", "This is second");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.heart), "third", "This is third");


        // ListView에 Click 이벤트에 대한 리스너 설정.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // getItemAtPosition() 함수의 리턴 타입은 Object 타입이므로 소스에서 정의한 아이템 데이터 타입으로 형변환을 해줘야 함.
                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);

                String titleStr = item.getTitle() ;
                String descStr = item.getDesc() ;
                Drawable iconDrawable = item.getIcon() ;

                // TODO : use item data.
                Toast.makeText(getApplicationContext(), titleStr, Toast.LENGTH_SHORT).show();
            }
        });
    }
}