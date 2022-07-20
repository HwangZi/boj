import java.io.*;
import java.util.*;

//2981
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<num; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        int val = list.get(1) - list.get(0);
        for(int i=2; i<num; i++){
            val = gcd(val, list.get(i) - list.get(i-1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=val; i++){
            if(val%i == 0){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
    
    static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}
