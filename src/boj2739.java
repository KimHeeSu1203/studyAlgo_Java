import java.util.Scanner;

public class boj2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for (int num = 1; num < 10; num++) {
            System.out.println(a+" * "+ num+ " = "+a*num);
        }

    }
}
