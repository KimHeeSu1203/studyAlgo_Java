import java.util.Scanner;

public class boj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int min = 1000000;
        int max =  -1000000;
        for (int i = 0; i < N; i++) {
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
