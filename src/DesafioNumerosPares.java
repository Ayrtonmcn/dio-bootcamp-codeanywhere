import java.util.Scanner;

public class DesafioNumerosPares {
    public static void main(String[] args) {
        // Utilizado para pedir uma entrada
        Scanner entrada = new Scanner(System.in);

        int valor;
        // Será solicitado ao usuário um dado para a variável valor
        System.out.print("Informe um número: ");
        valor = entrada.nextInt();

        // Fórmula para saber se o número digitado é par ou ímpar
        int resultado = valor % 2;

        // Se o resto for 0 o número será par
        if (resultado == 0) {
            while (resultado == 0 || resultado < valor) {
                resultado = resultado + 2;
                System.out.println(resultado);
            }

        // Se o resultado for 1 o número será ímpar
        }else{
            resultado = resultado - 1;
            valor = valor - 1;
            while (resultado == 0 || resultado < valor){
                resultado = resultado + 2;
                System.out.println(resultado);
            }
        }
    }
}
