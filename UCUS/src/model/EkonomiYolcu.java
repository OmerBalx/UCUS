package model;
import service.FirmaAdi;
import service.Yolcu;

public class EkonomiYolcu extends Yolcu {
    private static final int EKONOMIFIYAT = 100;

    public EkonomiYolcu(int id, String ad, String soyad) {
        super(id, ad, soyad);
    }

    @Override
    public void biletAl(FirmaAdi firmaAdi) {
        int fiyat = BASEFIYAT + EKONOMIFIYAT;
        String firmaAdiStr = firmaAdi.name();

        if (biletler.containsKey(firmaAdiStr)) {
            biletler.put(firmaAdiStr, fiyat);
            System.out.println(firmaAdi + " firmasından bilet güncellendi. Yeni fiyat: " + fiyat + " TL");
        } else {
            biletler.put(firmaAdiStr, fiyat);
            System.out.println("******* EKONOMIK YOLCU *******");
            System.out.println(ad + " " + soyad + " Adlı Yolcu " +firmaAdi + " firmasından " + fiyat + " TL'ye Ekonomık Sınıf bilet aldı.");
        }
    }
}
