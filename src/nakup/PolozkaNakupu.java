// Třída pro vytváření objektů (s hodnotami - atributy).
// Jednotlivé objekty vytvořené z této třídy 
// jsou pak ukládány do seznamu (ArrayList).

package nakup;

// Třída nemá konstruktor ani gettery/settery.
// Přístup k datům objektu je přímý (přes tečku).
// Proto jsou atributy deklarovány jako public.
// Správněji by měly být místo přímého přístupu použity
// pro přístup k datům metody třídy (setter/getter).

public class PolozkaNakupu {
    // atributy objektu (členské proměnné)
    public String nazev;
    public double cenakus;
    public int kusu;
}
