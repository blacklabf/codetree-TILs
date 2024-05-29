import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static Stack<Integer> s = new Stack<>();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String fir = st.nextToken();
            if(fir.equals("size")){
                System.out.println(s.size());
            }else if(fir.equals("empty")){
                if(s.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(fir.equals("pop")){
                System.out.println(s.pop());
            }else if(fir.equals("top")){
                System.out.println(s.peek());
            }else{
                int val = Integer.parseInt(st.nextToken());
                s.push(val);
            }
        }
    
    }

}