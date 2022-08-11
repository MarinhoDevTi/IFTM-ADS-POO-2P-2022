public class App {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        double x1, x2;
        double delta;


        Locale.setDefult(Locale.US);


        System.out.println("Digite um valor para a, b, c, ")

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = Math.pow(b,b: 2) -4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);


    }
}
