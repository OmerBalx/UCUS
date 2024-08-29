package service;
import java.util.HashMap;
import java.util.Random;

public abstract class Yolcu {
    
    protected int id;
    protected String ad;
    protected String soyad;
    protected int koltukNo;
    protected boolean checkin;
    protected static final int BASEFIYAT = 100;
    protected HashMap<String, Integer> biletler;

    public Yolcu(int id, String ad, String soyad) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.koltukNo = generateRandomKoltukNo();
        this.checkin = false;
        this.biletler = new HashMap<>();
    }

    private int generateRandomKoltukNo() {
        Random rand = new Random();
        return rand.nextInt(100) + 1; 
    }

    public abstract void biletAl(FirmaAdi firmaAdi);

    public void checkInYap() {
        System.out.println("Uçağa binmek için check-in yapın");
        if (this.checkin) {
            System.out.println("Zaten check-in yapılmış.");
        } else {
            this.checkin = true;
            System.out.println("Check-in yapıldı.");
        }
    }

    public void ucagaBin() {
        if (this.checkin) {
            System.out.println(this.ad + " " + this.soyad + " koltuk numarası " + this.koltukNo + " ile uçağa binebilirsiniz.");
        } else {
            System.out.println("Check-in yapılmadığı için uçağa binemezsiniz.");
        }
    }

    public void yolcuBilgileriniGetir() {
        System.out.println("Yolcu: " + this.ad + " " + this.soyad);
        System.out.println("Biletler:");
        for (String firma : biletler.keySet()) {
            System.out.println(firma + ": " + biletler.get(firma) + " TL");
            System.out.println(" ");
          
        }
    }
}
