import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        float[] test = new float[N];
        float M = 0;
        for (int i = 0; i < N; i++) {
            test[i] = sc.nextFloat();
            if(test[i]>M){
                M = test[i];
            }
        }
        float total = 0;

        for (int i = 0; i < N; i++) {
            test[i] = (test[i]/M)*100;
            total += test[i];
        }

        total = total / N;
        System.out.println(total);

    }
}
