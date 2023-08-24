import java.util.Scanner;

public class Main{
    public static String allocateLab(int x, int y, int z, int n) {
        int[] labs = {x, y, z};
        String[] labNames = {"L1", "L2", "L3"};
        String suitableLab = null;

        for (int i = 0; i < labs.length; i++) {
            if (labs[i] >= n) {
                if (suitableLab == null || labs[i] < labs[Integer.parseInt(suitableLab.substring(1)) - 1]) {
                    suitableLab = labNames[i];
                }
            }
        }

        return suitableLab;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();

        String result = allocateLab(x, y, z, n);
        System.out.println(result);

        scanner.close();
    }
}