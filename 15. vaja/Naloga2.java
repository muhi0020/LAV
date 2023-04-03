/* Napišite program, ki za podono točko v koordinatnem sistemu (x,y) izpiše, glede na
podano premico, ali se točka nahaja na levi strani premice, na desni strani premice,
ali na premici. Program naj uporabnika pozove k vnosu točke (x,y) in k in n
koeficientov premice (y = k*x +n) */

import java.util.Scanner;

public class Naloga2 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        System.out.print("Vnesite koordinato x tocke: ");
        int x = vhod.nextInt();
        System.out.print("Vnesite koordinato y tocke: ");
        int y = vhod.nextInt();
        System.out.print("Vnesite koeficient k premice: ");
        int k = vhod.nextInt();
        System.out.print("Vnesite koeficient n premice: ");
        int n = vhod.nextInt();
        int yIzracunan = k * x + n;

        if (y > yIzracunan) {
            System.out.println("Točka se nahaja na levi strani premice.");
        }
        else if (y < yIzracunan) {
            System.out.println("Točka se nahaja na desni strani premice");
        }
        else {
            System.out.println("Točka se nahaja na premici.");
        }

        vhod.close();
    }
}
