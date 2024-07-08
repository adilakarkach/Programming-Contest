import java.util.Scanner;

public class Espresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cap = scanner.nextInt();
        int curr = cap;
        int refill = 0;

        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            if (x.endsWith("L")) {
                x = x.substring(0, x.length() - 1);
                int parsedX = Integer.parseInt(x) + 1;
                x = Integer.toString(parsedX);
            }
            int parsedX = Integer.parseInt(x);

            if (curr - parsedX < 0) {
                refill++;
                curr = cap - parsedX;
            } else {
                curr -= parsedX;
            }
        }

        System.out.println(refill);
    }
}
