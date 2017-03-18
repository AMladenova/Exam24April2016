import java.util.Scanner;

/**
 * Created by mlade on 16/03/2017.
 */
public class StopSign {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int dots = n + 1;
        int dashes = 2 * n + 1;

        System.out.println(repeatStr(".", n + 1) + repeatStr("_", 2 * n + 1) + repeatStr(".", n + 1));
        dashes -= 2;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(".",dots - 1) + "//" + repeatStr("_", dashes) + "\\\\" + repeatStr(".",dots - 1));
            dots --;
            dashes += 2;
        }
        System.out.println("//" + repeatStr("_", (dashes - 5) / 2) +"STOP!"+ repeatStr("_", (dashes - 5) / 2) + "\\\\");
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(".",dots - 1) + "\\\\" + repeatStr("_", dashes) + "//" + repeatStr(".",dots - 1));
            dots ++;
            dashes -= 2;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }
        return sb.toString();
    }
}