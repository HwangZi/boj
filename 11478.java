import java.io.*;
import java.util.*;

//11478
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        int now = 1;
        while(now != str.length()+1){
            for(int i=0; i<=str.length()-now; i++){
                String temp = str.substring(i, i+now);
                set.add(temp);
            }
            now++;
        }
        System.out.println(set.size());
        
	}
}
