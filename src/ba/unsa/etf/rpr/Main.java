package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Unesite cijeli broj n: ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.println(i + "\n");
        }
    }

    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj > 0) {
            int cifra = broj % 10;
            broj = broj / 10;
            suma = suma + cifra;
        }
        return suma;
    }
}
