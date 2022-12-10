package com.example.animenews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    public class QuoteAdapter extends BaseAdapter {

        private Context newsContext;
        private LayoutInflater newsInflator;
        private DataSource newsDataSource;

        public QuoteAdapter(Context c) {
            newsContext = c;
            newsInflator = (LayoutInflater)
                    newsContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            newsDataSource = new DataSource();
        }

        @Override
        public int getCount() {
            return newsDataSource.getDataSourceLength();
        }

        @Override
        public Object getItem(int position) { return position; }

        @Override
        public long getItemId(int position) { return position; }

        @Override
        public View getView(int position, View convertView, ViewGroup
                parent)
        {
            ImageView thumbnail;
            TextView quote;

            if(convertView == null) {
                convertView = newsInflator.inflate(R.layout.list_news_layout,
                        parent,false);
            }

            thumbnail = convertView.findViewById(R.id.thumb);   thumbnail.setImageResource(newsDataSource.getphotoPool()
                .get(position));
            quote = convertView.findViewById(R.id.text);
            quote.setText(newsDataSource.getnewsPool().get(position));

            return convertView;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = findViewById(R.id.news_list);
        mListView.setAdapter(new QuoteAdapter(this));

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView arg0, View arg1, int
                    position,long arg3) {
                Intent i = new Intent(MainActivity.this,
                        NewsDetail.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}