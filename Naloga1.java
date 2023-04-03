/*
Nekatera spletna mesta zahtevajo »močna« gesla. Napišite metodo, ki preveri, če je
geslo močno. Upošteva naj naslednja tri pravila:
    • Geslo mora vsebovati vsaj 8 znakov
    • Geslo mora vsebovati črke in vsaj dve številki
    • Geslo mora vsebovati vsaj enega izmed znakov (!@#$%&*)
Napiši program, ki pozove uporabnika k vpisu gesla in izpiše »močno geslo«, če so
izpolnjena vsa pravila in »šibko geslo«, če katero od pravil ni izpolnjeno.
 */

import java.util.Scanner;

public class Naloga1 {
    static boolean jeVarnoGeslo(String geslo) {
        int steviloZnakov = 0;
        int steviloCrk = 0;
        int steviloStevilk = 0;
        String znaki = "!@#$%&*";
        for (int i = 0; i < geslo.length(); i++) {
            if (geslo.charAt(i) >= 65 && geslo.charAt(i) <= 90 || geslo.charAt(i) >= 97 && geslo.charAt(i) <= 122) {
                steviloCrk++;
            }
            if (geslo.charAt(i) >= 48 && geslo.charAt(i) <= 57) {
                steviloStevilk++;
            }
            for (int j = 0; j < znaki.length(); j++) {
                if (geslo.charAt(i) == znaki.charAt(j)) steviloZnakov++;
            }
        }

        return steviloZnakov >= 8 && steviloCrk > 0 && steviloZnakov > 0 && steviloStevilk >= 2 && geslo.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        String geslo = vhod.nextLine();
        System.out.println("Ali je geslo " + geslo + " varno? " + jeVarnoGeslo(geslo));
        vhod.close();
    }
}