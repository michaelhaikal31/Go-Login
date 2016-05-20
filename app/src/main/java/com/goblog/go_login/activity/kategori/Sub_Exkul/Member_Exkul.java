package com.goblog.go_login.activity.kategori.Sub_Exkul;

/**
 * Created by haikal on 4/16/2016.
 */
public class Member_Exkul {

    String nama_exkul;
    int photo_exkul;
    int bookmark_exkul;
    int share_exkul;
    int more_exkul;

    public Member_Exkul(String nama_exkul, int photo_exkul, int bookmark_exkul, int share_exkul, int more_exkul) {
        this.nama_exkul = nama_exkul;
        this.photo_exkul = photo_exkul;
        this.bookmark_exkul = bookmark_exkul;
        this.share_exkul = share_exkul;
        this.more_exkul = more_exkul;
    }

    public String getNama() {
        return nama_exkul;
    }

    public int getPhotoID() {
        return photo_exkul;
    }

    public int getBookmark(){ return bookmark_exkul;}

    public int getShare(){ return share_exkul;}
    public int getMore(){return more_exkul;}

    public void setBookmark(int bookmark_exkul){this.bookmark_exkul = bookmark_exkul;}

    public void setShare(int share_exkul){this.share_exkul = share_exkul;}
    public void setMore(int more_exkul){this.more_exkul = more_exkul;}

    public void setName(String nama_exkul) {
        this.nama_exkul = nama_exkul;
    }


    public void setPhotoID(int photo_exkul) {
        this.photo_exkul = photo_exkul;
    }
}