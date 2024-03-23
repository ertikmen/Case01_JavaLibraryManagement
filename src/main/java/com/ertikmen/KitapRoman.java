package com.ertikmen;

public class KitapRoman extends Kitap{

    private ETur tur=ETur.ROMAN;

    public KitapRoman(String ISBN,String kitapAd, String yazarAd, String yazarSoyad) {
        super(ISBN,kitapAd ,yazarAd, yazarSoyad);
    }

    public ETur getTur() {
        return tur;
    }

    @Override
    public String toString() {
        return "RomanKitap{" +
                "ISBN='" + ISBN + '\'' +
                "KitapAd= "+kitapAd+'\''+
                ", yazarAd='" + yazarAd + '\'' +
                ", yazarSoyad='" + yazarSoyad + '\'' +
                ", durum=" + durum + ", tur="+tur+
                '}';
    }
}
