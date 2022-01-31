import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class boj5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countLine = Integer.parseInt(br.readLine());
        for (int i = 0; i < countLine; i++) {
            System.out.println(findPassword(br.readLine()));
            //bw.write(findPassword(typing));
            /*
            LinkedList<Character> password = new LinkedList<>();
            String typing = new String();
            for (int j = 0; j < typing.length(); j++) {
                switch (typing.charAt(j)){
                    case '>':

                }
            }

             */
        }
    }
    public static String findPassword(String password){ // 한줄씩 이미 들어왔음
        LinkedList<Character> listPassword = new LinkedList<>();
        ListIterator<Character> iter = listPassword.listIterator();

        for (int i = 0; i < password.length(); i++) {
            switch (password.charAt(i)){
                case '<':
                    if(iter.hasPrevious()){
                        iter.previous();
                    }
                    break;
                case '>':
                    if (iter.hasNext()){
                        iter.next();
                    }
                    break;
                case '-':
                    if (iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                    break;
                default:
                    iter.add(password.charAt(i));
                    break;
            }
        }
        StringBuilder result = new StringBuilder();

        for(char i : listPassword){
            result.append(i);
        }

        return result.toString().trim();
    }
}
//<<BP<A>>Cd-