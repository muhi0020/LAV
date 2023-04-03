/* Napišite metodo, ki formatira določeno celo število na določeno število mest:
public static String format(int stevilo, int stevilo_mest)
Metoda vrne niz (string) dolžine stevilo_mest. Primer: klic metode format(22, 5) vrne
niz 00022. Klic format(4657, 5) vrne 04657.*/

public class Naloga1 {
    public static String format(int stevilo, int stevilo_mest) {
        if (stevilo >= stevilo_mest)
            return Integer.toString(stevilo);
        int dolzinaStevila = Integer.toString(stevilo).length();
        int steviloNicel = stevilo_mest - dolzinaStevila;
        String niz = "";
        for (int i = 0; i < steviloNicel; i++) {
            niz += "0";
        }
        niz += Integer.toString(stevilo);
        return niz;
    }

    public static void main(String[] args) {
        System.out.println(format(22, 5)); // 00022
        System.out.println(format(4, 5)); // 00004
    }
}
