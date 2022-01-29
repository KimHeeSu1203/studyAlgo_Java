import java.util.Scanner;

public class boj1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt(); // 26
        int new_ab = ab;

        int num = 0;

        while(true){
            int a = new_ab / 10; // 2
            int b = new_ab % 10; // 6
            int c = (a + b) % 10;  // 8
            new_ab = 10*b + c;
            num++;
            if (ab == new_ab) {
                System.out.println(num);
                break;
            }
        }
    }
}
