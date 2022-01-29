import java.util.Scanner;

public class boj3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[42];
        int total = 0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            nums[a%42]++;
        }
        for (int i = 0; i < 42; i++) {
            if (nums[i]>=1){
                total++;
            }
        }
        sc.close();
        System.out.println(total);
    }
}
