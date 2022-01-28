import java.util.Scanner;

public class boj2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a*(b%10));
        System.out.println(a*((b%100-b%10)/10));
        System.out.println(a*(b/100));

        System.out.print(a*b);
    }
}
/*
*
* 472
385
* */
