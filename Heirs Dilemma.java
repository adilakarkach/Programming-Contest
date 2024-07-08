import java.util.Arrays;

public class HeirsDilemma {
    public static boolean works(int n) {
        int tmp = n;
        int[] cnt = new int[10];
        Arrays.fill(cnt, 0);
        while (n > 0) {
            if ((n % 10) == 0) return false;
            if (tmp % (n % 10) != 0) return false;
            cnt[n % 10]++;
            n /= 10;
        }
        for (int i : cnt) {
            if (i > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int lo, hi;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        lo = scanner.nextInt();
        hi = scanner.nextInt();

        int total = 0;
        for (int i = lo; i <= hi; i++) {
            if (works(i)) {
                total++;
            }
        }

        System.out.println(total);
    }
}
