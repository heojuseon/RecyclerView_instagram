package com.example.recyclerview_instargram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_instargram.Data.CfData;
import com.example.recyclerview_instargram.Data.InsData;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler_view = findViewById(R.id.recycler_view);

        //레이아웃 매니저는 리싸이클러뷰가 보일 기본적인 형태를 설정할 때 사용한다.
        //LinearLayoutManager : 세로방향(Vertical), 가로방향(Horizontal)
        //GridLayoutManager : 격자모양
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler_view.setLayoutManager(layoutManager);

        InstagramAdapter adapter = new InstagramAdapter();

        adapter.addItem(new InsData(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 0, "허주선", "200개", "#팔로우 #맞팔 #선팔"));

        adapter.addItem2(new CfData(R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, 1, "인스타", "나이키", "색상", "100원"));

        adapter.addItem(new InsData(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 0, "믓쨍이", "171개", "팔로우 #맞팔 #선팔"));

        adapter.addItem(new InsData(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 0, "여행", "20K", "팔로우 #맞팔 #선팔"));

        adapter.addItem(new InsData(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 0, "운동", "48개", "팔로우 #맞팔 #선팔 #헬린"));

        adapter.addItem(new InsData(R.mipmap.ic_launcher, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 0, "음식", "67개", "팔로우 #맞팔 #선팔 #맛집"));



        //recyclerview 화면 연결
        recycler_view.setAdapter(adapter);
    }
}