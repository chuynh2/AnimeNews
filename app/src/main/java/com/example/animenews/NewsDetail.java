package com.example.animenews;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetail extends AppCompatActivity{
    private ImageView imageView;
    private TextView news;
    private int position;
    private DataSource dataSource;

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        position = i.getIntExtra("position", 0);

        dataSource = new DataSource();
        imageView = findViewById(R.id.image);
        news = findViewById(R.id.news);
        imageView.setImageResource(dataSource.getphotoHdPool().
                get(position));

        news.setText(getResources().getString(dataSource.getnewsPool()
                .get(position)));
    }
}
