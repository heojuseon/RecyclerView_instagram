package com.example.recyclerview_instargram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram_item);

        recycler_view = findViewById(R.id.recycler_view);

        //레이아웃 매니저는 리싸이클러뷰가 보일 기본적인 형태를 설정할 때 사용한다.
        //LinearLayoutManager : 세로방향(Vertical), 가로방향(Horizontal)
        //GridLayoutManager : 격자모양
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler_view.setLayoutManager(layoutManager);

        InstagramAdapter adapter = new InstagramAdapter();

        adapter.addItem(new Instagram(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, "허주선", "25개", "팔로우"));

        recycler_view.setAdapter(adapter);
    }
}