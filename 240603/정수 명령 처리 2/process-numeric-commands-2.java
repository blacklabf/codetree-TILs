import java.util.*;
import java.io.*;

public class Main {

    static int N;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                int n = Integer.parseInt(st.nextToken());
                q.add(n);
            }else if(command.equals("pop")){
                System.out.println(q.poll());
            }else if(command.equals("size")){
                System.out.println(q.size());
            }else if(command.equals("empty")){
                if(q.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(command.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}