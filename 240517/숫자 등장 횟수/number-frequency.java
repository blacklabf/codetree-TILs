import java.util.*;
import java.io.*;


public class Main {
    
    static int N;
    static int M;
    static HashMap<Integer, Integer> m = new HashMap<>();
    static StringTokenizer st;
    // 아영자바천재
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(m.containsKey(a)){
                m.put(a, m.get(a)+1);
            }else{
                m.put(a, 1);
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            // 아영 자바 고수
            int a = Integer.parseInt(st.nextToken());
            if(m.containsKey(a)){
                System.out.print(m.get(a) + " ");
            }else{
                System.out.print("0" + " ");
            }
        }
                
    }
}