package com.goblog.go_login.activity.kategori.Sub_Home;

/**
 * Created by haikal on 4/16/2016.
 */
public class Member_Home {

    String nama_home;
    int photo_home;
    public Member_Home(String nama_home, int photo_home) {
        this.nama_home = nama_home;
        this.photo_home = photo_home;
    }

    public String getNama() {
        return nama_home;
    }

    public int getPhotoID() {
        return photo_home;
    }

    public void setName(String nama_home) {
        this.nama_home = nama_home;
    }

    public void setPhotoID(int photo_home) {
        this.photo_home = photo_home;
    }
}