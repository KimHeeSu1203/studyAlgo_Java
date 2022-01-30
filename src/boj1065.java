import java.util.Scanner;

public class boj1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num<100){
            System.out.println(num);
        }
        else {
            System.out.println(hansu(num));
        }
    }
    public static int hansu(int num){
        int count = 99;

        for (int i = 100; i <=num; i++) {
            int[] eachNum = new int[3];

            eachNum[0] = i / 100;
            eachNum[1] = (i / 10)%10;
            eachNum[2] = i % 10;

            if ((eachNum[1] - eachNum[0]) == (eachNum[2] - eachNum[1])){
                count++;
            }
        }

        return count;

    }
}
