import java.util.Scanner;

public class SalarioMes {
    public static void main(String[] args) {
        System.out.println("Informe quanto recebe por hora e em seguida quantas horas trabalhou no mês:");
        Scanner time = new Scanner(System.in);
        Scanner money = new Scanner(System.in);
        double hour = time.nextDouble();
        double gain = money.nextDouble();
        double wage = hour * gain;
        System.out.println("O salário no mês referido é: "+wage);
        time.close();
        money.close();

    }
}
