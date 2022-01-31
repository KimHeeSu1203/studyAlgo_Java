

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine()); //  Integer.parseInt(st.nextToken())
        String first = br.readLine();
        int count = Integer.parseInt(br.readLine());

        LinkedList<Character> alpha = new LinkedList<>();
        for (int i = 0; i < first.length(); i++) {
            alpha.add(first.charAt(i));
            //System.out.println(first.charAt(i));
        }
        ListIterator<Character> iter = alpha.listIterator();

        while(iter.hasNext()){
            iter.next();
        }

        int cursor = alpha.size();
        //System.out.println("cursor : "+cursor);
        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L' :
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                //System.out.println("L, cursor : " + cursor);
                case 'D' :
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                //System.out.println("D, cursor : " + cursor);
                case 'B' :
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                        //System.out.println("B, cursor : " + cursor);
                    }
                    break;

                case 'P' :
                    char nnext = command.charAt(2);
                    //System.out.println(nnext);
                    iter.add(nnext);
                    
                    break;
                //System.out.println("P, cursor : " + cursor);
                default:
                    break;

            }

        }

        for(Character chr : alpha){
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}



// 시간초과 ver.2
/*
public class boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine()); //  Integer.parseInt(st.nextToken())
        String first = br.readLine();
        int count = Integer.parseInt(br.readLine());

        LinkedList<Character> alpha = new LinkedList<>();

        for (int i = 0; i < first.length(); i++) {
            alpha.add(first.charAt(i));
            //System.out.println(first.charAt(i));
        }

        int cursor = alpha.size();
        //System.out.println("cursor : "+cursor);
        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L' :
                    if (cursor != 0) {
                        cursor--;
                    }
                    break;
                    //System.out.println("L, cursor : " + cursor);
                case 'D' :
                    if (cursor != alpha.size()) {
                        cursor++;
                    }
                    break;
                    //System.out.println("D, cursor : " + cursor);
                case 'B' :
                    if (cursor != 0) {
                        alpha.remove(--cursor);
                        //System.out.println("B, cursor : " + cursor);
                    }
                    break;

                case 'P' :
                    Character nnext = command.charAt(2);
                    alpha.add(cursor, nnext);
                    cursor++;
                    break;
                    //System.out.println("P, cursor : " + cursor);
                default:
                    break;

            }

        }

        for(Character chr : alpha){
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}
*/



// 시간초과 ver.1
/*
public class boj1406 {
    public static void main(String[] args) {
        LinkedList<String> alpha = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        for (int i = 0; i < first.length(); i++) {
            alpha.add(String.valueOf(first.charAt(i)));
            //System.out.println(first.charAt(i));
        }
        int count = sc.nextInt();
        int cursor = alpha.size();
        //System.out.println("cursor : "+cursor);
        for (int i = 0; i < count; i++) {
            String next = sc.next();
            if (next.equals("L")){
                if (cursor!=0){
                    cursor--;
                }
                //System.out.println("L, cursor : " + cursor);
            }
            else if (next.equals("D")){
                if (cursor!= alpha.size()){
                    cursor++;
                }
                //System.out.println("D, cursor : " + cursor);
            }
            else if (next.equals("B")){
                if (cursor!=0){
                    alpha.remove(--cursor);
                    //System.out.println("B, cursor : " + cursor);
                }

            }
            else if (next.equals("P")){
                String nnext = sc.next();
                alpha.add(cursor,nnext);
                cursor++;
                //System.out.println("P, cursor : " + cursor);
            }
            else{
                break;
            }

        }

        for(String i : alpha){
            System.out.print(i);
        }

    }
}*/
