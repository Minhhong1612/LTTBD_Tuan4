package com.example.tuan4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nấu lẩu, nấu mì mini...","Shop Devang" ));
        listLanguage.add(new Language(2, "1 KG khô gà bơ tỏi...","Shop DTĐ Food"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Shop Thế giới đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình","Shop Thế giới đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo giản đơn","Shop Minh Long Book"));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ","Shop Minh Long Book"));
        listLanguage.add(new Language(7, "Donal Trum thiên tài lãnh đạo",""));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_listview, listLanguage);
        listView.setAdapter(adapter);

    }
}
