import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        double x1, x2;
        double delta;


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um valor para a, b, c, ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = Math.pow(b,2) -4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("X1 " + x1);
        System.out.println("X2 " + x2);



    }
}
