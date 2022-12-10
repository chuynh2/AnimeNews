package com.example.animenews;

import java.util.ArrayList;

public class DataSource {
    private ArrayList<Integer> photoPool;
    private ArrayList<Integer> newsPool;
    private ArrayList<Integer> photoHdPool;
    private ArrayList<Integer> youtubePool;

    public ArrayList<Integer> getYoutubePool() {
        return youtubePool;
    }

    public ArrayList<Integer> getphotoHdPool() {
        return photoHdPool;
    }

    public ArrayList<Integer> getphotoPool() {
        return photoPool;
    }

    public ArrayList<Integer> getnewsPool() {
        return newsPool;
    }

    private void setupYoutubePool() {
        youtubePool.add(R.string.youtube_1);

    }

    private void setupPhotoPool() {
        photoPool.add(R.drawable.dark_gathering);
        photoPool.add(R.drawable.slime_film);
        photoPool.add(R.drawable.suzume_no_tojimari);
        photoPool.add(R.drawable.bullbuster);
        photoPool.add(R.drawable.dont_toy_with_me);
        photoPool.add(R.drawable.flaglia);
        photoPool.add(R.drawable.mob_psycho);
        photoPool.add(R.drawable.jujutsu_kaisen);
        photoPool.add(R.drawable.by_the_grace_of_the_gods);
        photoPool.add(R.drawable.oyukiumi_no_kaina);
    }
    private void setupNewsPool() {
        newsPool.add(R.string.news_1);
        newsPool.add(R.string.news_2);
        newsPool.add(R.string.news_3);
        newsPool.add(R.string.news_4);
        newsPool.add(R.string.news_5);
        newsPool.add(R.string.news_6);
        newsPool.add(R.string.news_7);
        newsPool.add(R.string.news_8);
        newsPool.add(R.string.news_9);
        newsPool.add(R.string.news_10);

    }
    private void setupPhotoHDPool() {
        photoHdPool.add(R.drawable.dark_gathering);
        photoHdPool.add(R.drawable.slime_film);
        photoHdPool.add(R.drawable.suzume_no_tojimari);
        photoHdPool.add(R.drawable.bullbuster);
        photoHdPool.add(R.drawable.dont_toy_with_me);
        photoHdPool.add(R.drawable.flaglia);
        photoHdPool.add(R.drawable.mob_psycho);
        photoHdPool.add(R.drawable.jujutsu_kaisen);
        photoHdPool.add(R.drawable.by_the_grace_of_the_gods);
        photoHdPool.add(R.drawable.oyukiumi_no_kaina);
    }

    public int getDataSourceLength() { return photoPool.size(); }

    public DataSource() {
        photoPool = new ArrayList();
        newsPool = new ArrayList();
        photoHdPool = new ArrayList();
        youtubePool = new ArrayList();

        setupYoutubePool();
        setupPhotoPool();
        setupNewsPool();
        setupPhotoHDPool();

    }

}
