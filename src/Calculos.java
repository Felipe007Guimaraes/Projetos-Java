import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        System.out.println("Cálculos:");
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int firstInt = first.nextInt();
        System.out.println("Digite outro número inteiro:");
        int secondInt = second.nextInt();
        System.out.println("Agora digite um numero real:");
        float thirdFloat = third.nextFloat();
        int multiplication = (firstInt * 2) * (secondInt/2);
        float sum = (firstInt * 3) + thirdFloat;
        float cubed = (thirdFloat * thirdFloat) * thirdFloat;
        System.out.println("O produto do primeiro número informado com a metade do segundo é: "+multiplication);
        System.out.println("A soma do triplo do primeiro número informado com o terceiro é: "+sum);
        System.out.println("O valor do terceiro número ao cubo é? "+cubed);
    }
}
