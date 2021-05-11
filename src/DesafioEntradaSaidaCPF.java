import java.util.Scanner;

public class DesafioEntradaSaidaCPF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        cpf = entrada.nextLine();

        System.out.println(cpf.substring(0, 3));
        System.out.println(cpf.substring(4, 7));
        System.out.println(cpf.substring(8, 11));
        System.out.println(cpf.substring(12, 14));
    }
}