import java.util.Locale;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = 0; // счетчик значения высоты моста
        int b = 1; // мосты
        int s = in.nextInt(); // ввод кол-ва мостов

        while (b < s) {
            h = in.nextInt(); //  ввод значения высоты моста
            if (h < 437) {
                System.out.println("Врезался " + b);
                break;
            }
            b++;
        }
        if (h >437) {
            System.out.println("No Crash"+ b);
        }
    }
}
