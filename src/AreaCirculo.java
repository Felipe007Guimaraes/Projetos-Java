import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        System.out.println("Digite o raio do círculo para descobrir sua àrea:");
        Scanner circle = new Scanner(System.in);
        float radius = circle.nextFloat();
        final double PI = 3.14;
        double area = PI *(radius * radius);
        System.out.println("A àrea do círculo de raio "+radius+" é "+area);
        circle.close();

    }
}
