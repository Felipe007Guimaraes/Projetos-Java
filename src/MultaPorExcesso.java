import java.util.Scanner;

public class MultaPorExcesso {
    public static void main(String[] args) {
        System.out.println("Papo-de-Pescador");
        System.out.println("O peso de peixes estabelecido pelo regulamento de pesca são 50Kg");
        System.out.println("Multa de 4,00 por quilo a mais do permitido!");
        System.out.println("informe quantos quilos foram pescados:");
        Scanner w = new Scanner(System.in);
        float weight = w.nextFloat();
        if (weight<= 50 ) {
            System.out.println("Não houve multa");
        }
        else {
            System.out.println("O valor da multa é"+((weight-50)*4));
        }
    }
}
