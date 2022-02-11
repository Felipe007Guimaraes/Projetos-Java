import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PesoIdealPorGenero {
    public static void main(String[] args) {
        Scanner h = new Scanner (System.in);
        System.out.println("Descobrindo o peso ideal:");
        double weight = h.nextDouble();
        double woman = (62.1 * weight) - 44.7;
        double men = (72.7 * weight) - 58;
        System.out.println("O peso ideal para homem nesta altura é: "+woman);
        System.out.println("O peso ideal para mulheres nesta altura é: "+men);

    }
}
