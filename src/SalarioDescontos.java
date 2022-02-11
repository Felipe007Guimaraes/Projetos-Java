import java.text.DecimalFormat;
import java.util.Scanner;
public class SalarioDescontos {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Informe quanto recebe por hora e em seguida quantas horas trabalhou no mês:");
        Scanner time = new Scanner(System.in);
        Scanner money = new Scanner(System.in);
        double hour = time.nextDouble();
        double gain = money.nextDouble();
        double wage = hour * gain;
        System.out.println("+    Sálario  Bruto : " + fmt.format(wage));
        System.out.println("R$");
        System.out.println("- IR   (11%)      R$: " + fmt.format(wage * 0.11));
        System.out.println("- INSS (8%)       R$: " + fmt.format(wage * 0.08));
        System.out.println("- Sindicáto (5%)  R$: " + fmt.format(wage * 0.05));
        System.out.println("R$");
        System.out.println("= Salário Liquido R$: " + fmt.format(wage * 0.76));
        time.close();
        money.close();
    }
}
