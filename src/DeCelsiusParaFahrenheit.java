import java.util.Scanner;

public class DeCelsiusParaFahrenheit {
    public static void main(String[] args) {
        System.out.println("De Celsius para Fahrenheit.");
        System.out.println("Digite os graus Celsius para coverter:");
        Scanner c = new Scanner(System.in);
        float celsius = c.nextFloat();
        float fahrenheit = (celsius * 9/5)+32;
        System.out.println("Temperatura em fahrenheit: "+fahrenheit+"F");
        c.close();

    }
}
