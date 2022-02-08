import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        System.out.println("Digite quatro valores para ser calculada a média:");
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);
        Scanner fourth = new Scanner(System.in);
        int number1 = first.nextInt();
        int number2 = second.nextInt();
        int number3 = third.nextInt();
        int number4 = fourth.nextInt();
        int average = (number1 + number2 + number3 + number4)/4;
        System.out.println("A média entre os numeros é "+average);
    }
}
