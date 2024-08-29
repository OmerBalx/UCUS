package model;

import service.Yolcu;
import service.FirmaAdi;

public class BusinessYolcu extends Yolcu {
    private static final int BUSINNESFIYAT = 200;
    private static final int BUSINNESVIPFIYAT = 150;
    private boolean vip;

    public BusinessYolcu(int id, String ad, String soyad, boolean vip) {
        super(id, ad, soyad);
        this.vip = vip;
    }

    @Override
    public void biletAl(FirmaAdi firmaAdi) {
        int fiyat = BASEFIYAT + BUSINNESFIYAT;
        if (vip) {
            fiyat += BUSINNESVIPFIYAT;
        }
        biletler.put(firmaAdi.name(), fiyat);
       System.out.println("***** BUSINESS VIP YOLCU *****");
         System.out.println( ad + " " + soyad + " Adlı Yolcu " +firmaAdi + " firmasından " + fiyat + " TL'ye VİP bilet almıştır.");
    }
}
