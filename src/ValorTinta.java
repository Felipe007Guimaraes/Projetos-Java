import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorTinta {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        Scanner a = new Scanner(System.in);
        System.out.println("Intorme quantos metros quadrados deseja pintar:");
        double area = a.nextFloat();
        double inkYeld= area/6;
        int quantity = ((int)Math.ceil(inkYeld/18));
        double value = quantity*80;
        System.out.println("Será necessário "+fmt.format(inkYeld)+" Litros de tinta para a pintura!");
        System.out.println("Quantidade de Latas: "+quantity+"\nvalor da unidade: R$ 80,00");
        System.out.println("Valor da compra: R$ "+(fmt.format(value)));


    }
}
