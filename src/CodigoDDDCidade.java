import java.io.IOException;
import java.util.Scanner;

public class CodigoDDDCidade {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int DDD = leitor.nextInt();
        switch (DDD) {
            case 61: System.out.println("Brasilia"); break;
            //continue o desafio

            default: System.out.println("DDD nao cadastrado");
        }
    }

}
