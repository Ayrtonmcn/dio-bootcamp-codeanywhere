//Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

import java.util.Scanner;

public class DesafioNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++ ) {
            if (i % 2 == 0 && i <= n) {
                System.out.println(i);
            }
        }
    }
}
