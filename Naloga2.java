/* Napiši metodi:
public static boolean jeVeljaven(double stranica1, double stranica2, double stranica3)
public static double povrsina(double stranica1, double stranica2, double stranica3)
Napiši testni program, ki pozove k vnosu treh stranic trikotnika in izpiše, če je
trikotnik veljaven. Če je veljaven izpiše njegovo površino.*/

import java.util.Scanner;

public class Naloga2 {
    public static boolean jeVeljaven(double stranica1, double stranica2, double stranica3) {
        return stranica1 + stranica2 > stranica3;
    }

    public static double povrsina(double stranica1, double stranica2, double stranica3) {
        double s = (stranica1 + stranica2 + stranica3) / 2;
        double povrsina = Math.sqrt(s * (s - stranica1) * (s-stranica2) * (s-stranica3));
        return povrsina;
    }

    public static void main(String args[]) {
        Scanner vhod = new Scanner(System.in);
        double a = vhod.nextDouble();
        double b = vhod.nextDouble();
        double c = vhod.nextDouble();

        boolean jeVeljaven = jeVeljaven(a, b, c);
        if (jeVeljaven) {
            System.out.println(povrsina(a, b, c));
        }

        vhod.close();
    }
}