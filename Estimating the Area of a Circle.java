import java.util.Scanner;

public class Area Estimate {
    public static final double PI = 3.141592654;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r, m, c, resa, resb;

        r = scanner.nextDouble();
        m = scanner.nextDouble();
        c = scanner.nextDouble();

        while (r != 0 && m != 0 && c != 0) {
            resa = PI * r * r;
            resb = 4 * c / m * r * r;

            System.out.printf("%.10f %.10f\n", resa, resb);

            r = scanner.nextDouble();
            m = scanner.nextDouble();
            c = scanner.nextDouble();
        }
    }
}
