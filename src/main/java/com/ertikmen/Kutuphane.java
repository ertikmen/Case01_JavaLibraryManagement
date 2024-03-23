package com.ertikmen;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {

    private List<Kitap> kitapList;
    private List<Uye> uyeList;

    public Kutuphane() {
        this.kitapList = new ArrayList<>();
        this.uyeList = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitapList.add(kitap);
    }

    public void uyeEkle(Uye uye) {
        uyeList.add(uye);
    }

    public void kitaplariGoruntule() {
        System.out.println("Kütüphanedeki Tüm Kitaplar:");
        for (Kitap kitap : kitapList) {
            System.out.println(kitap);
        }
    }

    public void uyeleriGoruntule() {
        System.out.println("Kütüphane Üyeleri:");
        for (Uye uye : uyeList) {
            System.out.println(uye.getAd());
        }
    }
}
