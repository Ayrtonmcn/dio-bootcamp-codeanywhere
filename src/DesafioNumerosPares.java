//Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

import java.util.Scanner;

public class DesafioNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        valor = entrada.nextInt();
        int resultado = valor % 2;

        if (resultado == 0) {
            while (resultado == 0 || resultado < valor) {
                resultado = resultado + 2;
                System.out.println(resultado);
            }
        } else {
            resultado = resultado - 1;
            valor = valor - 1;
            while (resultado == 0 || resultado < valor) {
                resultado = resultado + 2;
                System.out.println(resultado);
            }
        }
    }
}
