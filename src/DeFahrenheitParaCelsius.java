import java.util.Scanner;

public class DeFahrenheitParaCelsius {
    public static void main(String[] args) {
        System.out.println("De Fahrenheit para Celsius.");
        System.out.println("Informe os graus em Fahrenheit para converter:");
        Scanner f = new Scanner(System.in);
        float fahrenheit = f.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperatura em Celsius: "+celsius+"C");
        f.close();
    }
}
