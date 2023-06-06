package Grundlagen.OOP.Assosation;

public class Main {
    public static void main(String[] args) {
        Auftrag a1 = new Auftrag("06.06.2023");
        a1.setArt("Test Auftrag1");
        a1.setStundensatz(1001);
        a1.setAnzahlStunden(2001);

        Auftrag a2 = new Auftrag("07.06.2023");
        a2.setArt("Test Auftrag2");
        a2.setStundensatz(1002);
        a2.setAnzahlStunden(2002);

        Kunde k1 = new Kunde();
        k1.setFirmenadresse("Test adress 1001");
        k1.setFirmenname("Test GMbH");
        k1.setAuftragssumme(1000);

        k1.addAuftrag(a1, 0);
        k1.addAuftrag(a2, 1);


        System.out.println(k1.getAuftrag(0).getArt());
        System.out.println(k1.getAuftrag(1).getArt());
        System.out.println(k1.getAuftrag(2).getArt());

    }
}
