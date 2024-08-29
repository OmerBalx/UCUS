package main;

import model.BusinessYolcu;
import model.EkonomiYolcu;
import service.FirmaAdi;

public class Main {
    public static void main(String[] args) {
        BusinessYolcu businessYolcu = new BusinessYolcu(1, "Ferdi", "Kadıoğlu", true);
        businessYolcu.biletAl(FirmaAdi.THY);
        businessYolcu.checkInYap();
        businessYolcu.ucagaBin();
        businessYolcu.yolcuBilgileriniGetir();

        EkonomiYolcu ekonomiYolcu = new EkonomiYolcu(2, "Ömer", "Bal");
        ekonomiYolcu.biletAl(FirmaAdi.ADJ);
        ekonomiYolcu.checkInYap();
        ekonomiYolcu.ucagaBin();
        ekonomiYolcu.yolcuBilgileriniGetir();
    }
}
