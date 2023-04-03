/* Napiši metodo, ki prešteje število znakov v vnesenem nizu in testni program, ki za
vneseni niz izpiše njegovo dolžino. */

import java.util.Scanner;

public class Naloga3 {
    static int steviloZnakov(String niz) {
        return niz.length();
    }

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        String niz = vhod.nextLine();
        System.out.println(steviloZnakov(niz));
        vhod.close();
    }
}
