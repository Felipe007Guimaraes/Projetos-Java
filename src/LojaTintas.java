
import java.text.DecimalFormat;
import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        Scanner a = new Scanner(System.in);
        System.out.println("Informe quantos metros quadrados deseja pintar: ");
        double cans = 18;
        double gallons = 3.6;
        float area = a.nextInt();
        float quantity= area/6;
        System.out.println("Será necessário "+quantity+" Litros de tinta para a pintura!");
        System.out.println("Você pode comprar: \n"+((int)Math.ceil(quantity/gallons))+"galões no valor de R$25,00\nou");
        System.out.println(((int)Math.ceil(quantity/cans))+" Latas no valor de R$80,00");

    }
}
