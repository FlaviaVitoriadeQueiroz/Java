import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println(maior);
        scanner.close();
    }
}
