import java.sql.SQLOutput;
import java.util.Scanner;

public class boj9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90 & a <= 100){
            System.out.println("A");
        }
        else if (a < 90 & a>=80){
            System.out.println("B");
        }
        else if (a < 80 & a>=70){
            System.out.println("C");
        }
        else if (a < 70 & a>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}