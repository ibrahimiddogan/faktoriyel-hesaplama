import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i girin: ");
        int n = scanner.nextInt();

        System.out.print("r'yi girin: ");
        int r = scanner.nextInt();

        scanner.close();

        if (n >= r) {
            int kombinasyon = 1;
            int nFaktoriyel = 1;
            int rFaktoriyel = 1;


            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }


            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }


            int nMinusRFaktoriyel = 1;
            for (int i = 1; i <= (n - r); i++) {
                nMinusRFaktoriyel *= i;
            }

            kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        } else {
            System.out.println("Hatalı giriş! n, r'den büyük veya eşit olmalıdır.");
        }

    }
}
