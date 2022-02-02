import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> newstack = new Stack<>();
        int countLine = Integer.parseInt(br.readLine());
        for (int i = 0; i < countLine; i++) {
            String[] allCommand = br.readLine().split(" ");
            //String command = allCommand.split();
            //int commandNum = allCommand.
            /*
            push X: 정수 X를 스택에 넣는 연산이다.
            pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            size: 스택에 들어있는 정수의 개수를 출력한다.
            empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
            top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
             */
            switch (allCommand[0]){
                case "push":
                    //System.out.println("push"+Integer.parseInt(allCommand[1]));
                    newstack.push(Integer.parseInt(allCommand[1]));
                    break;
                case "pop":
                    if(newstack.size()>0) {
                        System.out.println(newstack.pop());
                    }
                    else{
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(newstack.size());
                    break;
                case "empty":
                    if (newstack.empty()){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(newstack.size()>0) {
                        System.out.println(newstack.peek());
                    }
                    else{
                        System.out.println(-1);
                    }
                    break;
            }

        }
        //bw.close();

    }
}
