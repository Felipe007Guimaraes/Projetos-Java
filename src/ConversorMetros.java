import java.util.Scanner;

public class ConversorMetros {
    public static void main(String[] args) {
        System.out.println("Digite os metros a serem transformados em centimetros:");
        Scanner m = new Scanner(System.in);
        float meters = m.nextFloat();
        float centimeters = meters*100;
        System.out.println(meters+" metros equivale a "+centimeters+" centimetros!");

    }
}
