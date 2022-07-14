import java.io.*;
import java.util.*;

//1269
public class boj {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int duplicate = 0;
        for(int k : setA){
            if(setB.contains(k)){
                duplicate++;
            }
        }
        System.out.println(a+b-2*duplicate);
	}
}
