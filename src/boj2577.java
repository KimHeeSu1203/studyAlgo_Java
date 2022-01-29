import java.util.Scanner;

public class boj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int ABC = A*B*C;
        int[] nums = new int[10];

        while(ABC > 0){
            int abc_num = ABC % 10;
            ABC = ABC / 10 ;
            nums[abc_num]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }

    }
}
