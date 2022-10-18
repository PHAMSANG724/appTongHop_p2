package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    private ImageView imageView;

    String[] title={"Kamen rider W(ダブル)","Kamen rider Zio(ジオウ)","Kamen rider Ex-Aid(エグゼイド)","Kamen rider Build(ビルド)",
            "Kamen rider Decade(ディケイド)","Kamen rider Kabuto(カブト)"};
    String[] subtitle={"Author: Ad PSang","Author: Ad PSang", "Author: Ad PSang","Author: Ad PSang","Author: Ad PSang","Author: Ad PSang"};
    Integer[] imgID = {R.drawable.krw, R.drawable.zio, R.drawable.exaid, R.drawable.build, R.drawable.decade, R.drawable.kabuto};
    String[] viewer = {"32,045 views","65,412 views","78,453 views","45,127 views","12,147 views","23,214 views"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView_id);
        MyListAdapter adapter = new MyListAdapter(ListViewActivity.this, title, subtitle, imgID, viewer);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListViewActivity.this, Navigation.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.iviewBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}