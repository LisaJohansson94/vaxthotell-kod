import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Vaxt> hotelletsVaxter = new ArrayList<>();
        hotelletsVaxter.add(new Kaktus("Igge", 0.20));
        hotelletsVaxter.add(new Palm("Laura", 5.0));
        hotelletsVaxter.add(new KottatandeVaxt("Meatloaf", 0.70));
        hotelletsVaxter.add(new Palm("Olof", 1.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Vilken växt ska få vätska? Igge, Laura, Meatloaf eller Olof: " +
                    "Eller skriv 'avsluta' för att stänga ner programmet: ");
            String soktNamn = scanner.nextLine().trim();

            if (soktNamn.equalsIgnoreCase("avsluta")) {
                System.out.println("Programmet avslutas");
                break;
            }

                if (soktNamn.isEmpty()) {
                    System.out.println("Du måste skriva in ett namn");
                    continue;
                }

                Vaxt hittad = null;

                // Polymorfism:Loopar igenom en lista av typen Vaxt, men Java anropar automatiskt rätt underklass unika formel.
                for (Vaxt vaxt : hotelletsVaxter) {
                    if (vaxt.getNamn().equalsIgnoreCase(soktNamn)) {
                        hittad = vaxt;
                        break;
                    }
                }

                if (hittad != null) {

                    System.out.println(hittad.getNamn() + " ska ha " +
                            hittad.mangdVatska() + " liter " +
                            hittad.getVatska().getVisningsnamn() + " per dag.");
                } else {
                    System.out.println("Finns ingen växt med namnet " + soktNamn + ", försök igen");
                }


            }
        }
    }





















