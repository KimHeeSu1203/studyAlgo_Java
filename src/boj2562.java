import java.util.Scanner;

public class boj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        int max_n = -1;
        for (int i = 0; i < N; i++) {
            if (nums[i]>max){
                max = nums[i];
                max_n = i+1;
            }

        }
        System.out.println(max);
        System.out.println(max_n);
    }
}
