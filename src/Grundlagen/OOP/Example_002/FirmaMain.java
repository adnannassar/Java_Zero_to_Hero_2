package Grundlagen.OOP.Example_002;


public class FirmaMain {
    public static void main(String[] args) {
        Abteilung personal = new Abteilung("Personal");
        Abteilung finanz = new Abteilung("Finanz");
        Abteilung vorstand = new Abteilung("Vorstand");

        Arbeiter hassan = new Arbeiter(
                "Hassan",
                12.0,
                160,
                14.0,
                personal);
        hassan.setAnzahlÜberstunden(20); // 2200.0€
        personal.addMitarbeiter(hassan);


        Angestellter nour = new Angestellter(
                "Nour",
                4000.00,
                500.00,
                200.00,
                finanz); // 4700€
        finanz.addMitarbeiter(nour);

        Manager jamil = new Manager(
                "Jamil",
                6500.00,
                500.00,
                vorstand);
        jamil.setUmsatz(1000.00); // 8000€
        vorstand.addMitarbeiter(jamil);

        Geschäftsführer ahmad = new Geschäftsführer(
                "Ahmad",
                8000,
                3000,
                5000,
                vorstand);
        ahmad.setUmsatz(4000); // 20000€
        vorstand.addMitarbeiter(ahmad);

        System.out.println("Infos via Mitarbeiters:");
        System.out.println("\tGehalt von " + hassan.getName() + " ,mit der Personalnummer: "
                + hassan.getPersonalnummer() + ", in der " + hassan.getAbteilung().getBezeichnung() + " Abteilung ist " + hassan.berechneGehalt() + "€");
        System.out.println("\tGehalt von " + nour.getName() + " ,mit der Personalnummer: "
                + nour.getPersonalnummer() + ", in der " + nour.getAbteilung().getBezeichnung() + " Abteilung ist " + nour.berechneGehalt() + "€");
        System.out.println("\tGehalt von " + jamil.getName() + " ,mit der Personalnummer: "
                + jamil.getPersonalnummer() + ", in der " + jamil.getAbteilung().getBezeichnung() + " Abteilung ist " + jamil.berechneGehalt() + "€");
        System.out.println("\tGehalt von " + ahmad.getName() + " ,mit der Personalnummer: "
                + ahmad.getPersonalnummer() + ", in der " + ahmad.getAbteilung().getBezeichnung() + " Abteilung ist " + ahmad.berechneGehalt() + "€");

        System.out.println("\nInfos via Abteilungen:");
        System.out.println("\tAnzahl Mitarbeiter");
        System.out.println("\t\t" + personal.getBezeichnung() + " Abteilung ist " + personal.getAnzahlMitarbeiter());
        System.out.println("\t\t" + finanz.getBezeichnung() + " Abteilung ist " + finanz.getAnzahlMitarbeiter());
        System.out.println("\t\t" + vorstand.getBezeichnung() + " Abteilung ist " + vorstand.getAnzahlMitarbeiter());

        System.out.println("\n\tGet Mitarbeiter:");
        int i0 = 0, i1 = 1;
        System.out.println("\t\t Mitarbeiter von " + personal.getBezeichnung() + " Abteilung an der Stelle " + i0 + " ist " + personal.getMitarbeiter(i0).getName());
        System.out.println("\t\t Mitarbeiter von " + personal.getBezeichnung() + " Abteilung an der Stelle " + i1 + " ist " + personal.getMitarbeiter(i1)); // null
        System.out.println();
        System.out.println("\t\t Mitarbeiter von " + finanz.getBezeichnung() + " Abteilung an der Stelle " + i0 + " ist " + finanz.getMitarbeiter(i0).getName());
        System.out.println("\t\t Mitarbeiter von " + finanz.getBezeichnung() + " Abteilung an der Stelle " + i1 + " ist " + finanz.getMitarbeiter(i1)); // null
        System.out.println();
        System.out.println("\t\t Mitarbeiter von " + vorstand.getBezeichnung() + " Abteilung an der Stelle " + i0 + " ist " + vorstand.getMitarbeiter(i0).getName());
        System.out.println("\t\t Mitarbeiter von " + vorstand.getBezeichnung() + " Abteilung an der Stelle " + i1 + " ist " + vorstand.getMitarbeiter(i1).getName());

        System.out.println("\n\tGesamte Gehaltskosten:");
        System.out.println("\t\t Gesamt Kosten von " +  personal.getBezeichnung() + " Abteilung ist " + personal.berechneGehaltskosten()+ "€");
        System.out.println("\t\t Gesamt Kosten von " +  finanz.getBezeichnung() + " Abteilung ist " + finanz.berechneGehaltskosten()+ "€");
        System.out.println("\t\t Gesamt Kosten von " +  vorstand.getBezeichnung() + " Abteilung ist " + vorstand.berechneGehaltskosten()+ "€");

        System.out.println("\n\tGesamte Gehaltskosten aller Abteilungen: " + (personal.berechneGehaltskosten() +finanz.berechneGehaltskosten() + vorstand.berechneGehaltskosten()) + "€");


    }
}
