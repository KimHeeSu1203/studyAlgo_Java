import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();
        // 45분 먼저 울리게 하는 것
        // 23시로 가야하는 경우 : 0시 44분부터는 23시 59분으로 가야함

        int n_hour = hour;
        int n_minute = minute - 45;
        if (n_minute < 0){
            n_hour = n_hour-1;
            n_minute = 60 + n_minute; // 25 나와야 함 60+ 10 - 45

            if(n_hour < 0){
                n_hour = 24 + n_hour;
            }
        }
        System.out.println(n_hour+" "+n_minute);

    }
}
