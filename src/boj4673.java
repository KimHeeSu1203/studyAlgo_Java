public class boj4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i <10001 ; i++) {
            int n = d(i); // d(i) 로 나온 값이 n, n 은 d(i)의 생성자
            if(n<=10000) {
                check[n] = true;
            }
        }
        for (int i = 1; i <10001 ; i++) {
            if(!check[i]){
                System.out.println(i);
            }
        }

    }
    public static int d(int number){
        int sum = number;
        while(number !=0) {
            sum += (number % 10);
            number = number / 10;
        }
        //System.out.println("sum = "+ sum);
        return sum;
    }
}
