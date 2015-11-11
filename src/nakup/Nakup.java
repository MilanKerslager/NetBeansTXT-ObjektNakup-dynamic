package nakup;

import java.util.ArrayList;
import java.util.Scanner;

public class Nakup {

    public static void main(String[] args) {
        PolozkaNakupu polozka;
        polozka = new PolozkaNakupu();
        ArrayList<PolozkaNakupu> seznam = new ArrayList<>();
        
        Scanner vstup = new Scanner(System.in);
        
        System.out.print("Vlož název: ");
        polozka.nazev = vstup.nextLine();
        System.out.print("Vlož cenu za kus: ");
        polozka.cenakus = vstup.nextDouble();
        System.out.print("Vlož počet kusů: ");
        polozka.kusu = vstup.nextInt();
        
        seznam.add(polozka);

        System.out.println();
        
        for (PolozkaNakupu i: seznam) {
            System.out.println("Název zboží: "+i.nazev);
            System.out.println("Cena za kus: "+i.cenakus);
            System.out.println("Počet kusů: "+i.kusu);
            System.out.println("Celkem za položku: "+
                    i.cenakus*i.kusu);
        }
    }
    
}
