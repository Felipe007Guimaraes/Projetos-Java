import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        Scanner m = new Scanner(System.in);
        Scanner mbps = new Scanner(System.in);
        System.out.println("Para saber o tempo para download");
        System.out.println("Informe quantos MB o arquivo que pretende baixar possui:");
        double mb = m.nextDouble();
        System.out.println("Agora informe a velocidade do link em mbps:");
        double velocity = mbps.nextDouble();
        double time = mb/velocity;
        System.out.println("O download será concluído em aproximadamente:\n"+ time+" Segundos");
        System.out.println("ou\n" +fmt.format(time/60)+" Minutos!");


    }
}
