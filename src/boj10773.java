import java.util.Scanner;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> jangbu = new Stack<>();
        int total = 0;
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            if(number == 0){
                jangbu.pop();
            }
            else{
                jangbu.push(number);
            }
        }

        for (int i = 0; i < jangbu.size(); i++) {
            total += jangbu.get(i);
        }
        System.out.println(total);
    }
}
