import java.util.Scanner;
import java.util.Locale;

public class DesafioEntradaSaidaCPF {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        String[] cpf = entrada.nextLine().split("\\.|-");

        for (int i = 0; i < cpf.length; i++) {
            System.out.printf("%s\n", cpf[i]);
        }
        entrada.close();
    }
}