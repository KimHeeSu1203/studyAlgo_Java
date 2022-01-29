import java.util.Scanner;

public class boj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int N = sc.nextInt();
            int[] students = new int[N];
            float count = 0;
            int M = 0;
            for (int j = 0; j < N; j++) {
                students[j] = sc.nextInt();
                M += students[j];
            }
            M = M / N;
            for (int j = 0; j < N; j++) {
                if (students[j]>M){
                    count++;
                }
            }
            System.out.printf("%.3f", count/N*100);
            System.out.println("%");

        }
        sc.close();
    }
}
