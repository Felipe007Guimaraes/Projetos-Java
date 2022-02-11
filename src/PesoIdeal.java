import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner h = new Scanner (System.in);
        System.out.println("Descobrindo peso ideal:");
        System.out.println("Informe sua altura:");
        double height = h.nextDouble();
        double weight = ((72.7) * height)-58;
        System.out.println("Seu peso ideal é: "+weight);

    }
}
