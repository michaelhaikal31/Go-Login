package com.goblog.go_login.activity.kategori.Sub_Prestasi;

/**
 * Created by haikal on 5/6/2016.
 */
public class Item {
    private String nama;
    private int Images;
    public Item(String nama, int Images){
        this.nama = nama;
        this.Images = Images;
    }
    public String getNama(){return nama;}
    public void setNama(String nama){
        this.nama= nama;
    }
    public int getImages(){return Images;}
    public void setImages(int Images){
        this.Images = Images;
    }

}
