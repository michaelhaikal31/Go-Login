package com.goblog.go_login.activity.kategori.Sub_Jurusan;

/**
 * Created by haikal on 4/16/2016.
 */
public class Member_Jurusan {

    String nama_jurusan;
    int photo_jurusan;
    int bookmark;
    int share;
    int more;
    public Member_Jurusan(String nama_jurusan, int photo_jurusan, int bookmark, int share, int more) {
        this.nama_jurusan = nama_jurusan;
        this.photo_jurusan = photo_jurusan;
        this.bookmark = bookmark;
        this.share = share;
        this.more = more;
    }

    public String getNama() {
        return nama_jurusan;
    }

    public int getPhotoID() {
        return photo_jurusan;
    }
    public int getBookmark(){ return bookmark;}

    public int getShare(){ return share;}
    public int getMore(){return more;}

    public void setBookmark(int bookmark){this.bookmark = bookmark;}

    public void setShare(int share){this.share = share;}
    public void setMore(int more){this.more = more;}
    public void setName(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }


    public void setPhotoID(int photo_jurusan) {
        this.photo_jurusan = photo_jurusan;
    }
}