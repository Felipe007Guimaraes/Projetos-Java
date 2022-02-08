import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        System.out.println("Informe um lado do quadrado para calcular a àrea e o dobro dela:");
        Scanner a = new Scanner(System.in);
        float side = a.nextFloat();
        double area = side * side;
        System.out.println("A àrea do quadrado de lado "+side+" é "+area+" e o dobro da àrea é: "+(area*2));
        a.close();
    }
}
