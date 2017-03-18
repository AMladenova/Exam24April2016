import java.util.Scanner;

/**
 * Created by mlade on 16/03/2017.
 */
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        if ((n % a == 0) && (n % b == 0) && (n % c == 0) && (n % d == 0)) {
                            System.out.printf("%d%d%d%d ",a,b,c,d);
                        }
                    }
                }
            }
        }
    }
}