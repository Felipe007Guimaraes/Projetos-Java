import java.util.Scanner;
public class NumeroInformado {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        System.out.println("O número digitado é: "+ valor);
        read.close();
    }
}
