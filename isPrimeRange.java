import java.util.*;

public class isPrimeRange {
    public static void main(String[] arg6s) {
        Scanner scn = new Scanner(System.in);
        // write your code here
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;

            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
        scn.close();
    }
}