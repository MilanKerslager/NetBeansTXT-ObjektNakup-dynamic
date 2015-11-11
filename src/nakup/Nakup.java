package nakup;

import java.util.Scanner;

public class Nakup {

    public static void main(String[] args) {
        PolozkaNakupu polozka;
        polozka = new PolozkaNakupu();
        
        Scanner vstup = new Scanner(System.in);
        System.out.print("Vlož název: ");
        polozka.nazev = vstup.nextLine();
        System.out.print("Vlož cenu za kus: ");
        polozka.cenakus = vstup.nextDouble();
        System.out.print("Vlož počet kusů: ");
        polozka.kusu = vstup.nextInt();
        
        
        polozka.nazev = "rohlik";
        polozka.cenakus = 1.50;
        polozka.kusu = 9;
        
        System.out.println("Název zboží: "+polozka.nazev);
        System.out.println("Cena za kus: "+polozka.cenakus);
        System.out.println("Počet kusů: "+polozka.kusu);
        System.out.println("Celkem za položku: "+
                polozka.cenakus*polozka.kusu);
        
    }
    
}
