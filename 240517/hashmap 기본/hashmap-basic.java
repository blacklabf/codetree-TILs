import java.util.*;
import java.io.*;

public class Main {
    
    static int N;
    static HashMap<Integer, Integer> m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        m = new HashMap<>();
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int key = Integer.parseInt(st.nextToken());

            if(command.equals("add")){
                int value = Integer.parseInt(st.nextToken());
                m.put(key,value);
            }else if(command.equals("remove")){
                m.remove(key);
            }else{
                if(m.containsKey(key)){
                    System.out.println(m.get(key));
                }else{
                    System.out.println("None");
                }
            }
        }
    }
}