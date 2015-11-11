// Načti nákup do seznamu (ArrayList).
// Každá položka bude mít název, cenu za kus, počet kusů (budou to objekty).
// Vypiš seznam nakoupených věcí.

package nakup;

import java.util.ArrayList;
import java.util.Scanner;

public class Nakup {

    public static void main(String[] args) {
        PolozkaNakupu polozka;
        ArrayList<PolozkaNakupu> seznam = new ArrayList<>();
        Scanner vstup = new Scanner(System.in);
        
        polozka = new PolozkaNakupu();
        System.out.print("Vlož název: ");
        polozka.nazev = vstup.nextLine();
        while (! polozka.nazev.isEmpty()) {
            System.out.print("Vlož cenu za kus: ");
            polozka.cenakus = vstup.nextDouble();
            System.out.print("Vlož počet kusů: ");
            polozka.kusu = vstup.nextInt();
            // odkaz na nový a naplněný objekt je vložen do seznamu
            seznam.add(polozka);
            // začneme načítat další objekt
            vstup.nextLine();
            // musíme si vytvořit nový objekt, abychom nepřepsali původní
            // starý objekt nezanikne, protože je na něj odkaz z ArrayListu
            polozka = new PolozkaNakupu();
            System.out.print("Vlož název: ");
            polozka.nazev = vstup.nextLine();
        }
        // poslední vytvořený objekt už nebudeme potřebovat
        // (o uvolnění paměti se postará garbage collector)
        polozka = null;
        
        System.out.println();
        System.out.println("Výpis položek (objektů) z ArrayListu:");
        
        // vypíšeme celý seznam objektů uložený v ArrayListu
        for (PolozkaNakupu i: seznam) {
            System.out.println("Název zboží: "+i.nazev);
            System.out.println("Cena za kus: "+i.cenakus);
            System.out.println("Počet kusů: "+i.kusu);
            System.out.println("Celkem za položku: "+i.cenakus*i.kusu);
        }
    }    
}
