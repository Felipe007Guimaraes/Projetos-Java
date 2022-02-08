
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        System.out.println("Digite dois número para a soma:");
        Scanner primeiro = new Scanner(System.in);
        Scanner segundo = new Scanner(System.in);
        int num1 = primeiro.nextInt();
        int num2 = segundo.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma de "+num1+" e "+num2+" é: "+soma);
    }
}
