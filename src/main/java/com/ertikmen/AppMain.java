package com.ertikmen;

public class AppMain {
    public static void main(String[] args) {



        KitapBilim kitapBilim=new KitapBilim("12548526AB",
                "Sefiller", "Ali","Güneş");

        KitapRoman kitapRoman=new KitapRoman("125485AAS",
                "Yarim Haziran","Engin","Ertikmen");


        Uye uye1=new Uye("Aysu");

        uye1.kitapOduncAl(kitapBilim);
        uye1.kitapOduncAl(kitapRoman);

        uye1.oduncAlinanKitaplariGoruntule();

        uye1.kitapIadeEt(kitapRoman);

        uye1.oduncAlinanKitaplariGoruntule();

        Kutuphane kutuphane1=new Kutuphane();

        kutuphane1.kitapEkle(kitapBilim);
        kutuphane1.kitapEkle(kitapRoman);

        kutuphane1.uyeEkle(uye1);

        kutuphane1.kitaplariGoruntule();

        kutuphane1.uyeleriGoruntule();














    }
}