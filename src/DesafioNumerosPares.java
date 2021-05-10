public class DesafioNumerosPares {
    public static void main(String[] args) {

        int valor = 18;
        int resultado = valor % 2;

        if (resultado == 0) {
            while (resultado == 0 || resultado < valor) {
                resultado = resultado + 2;
                System.out.println(resultado);
            }
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
