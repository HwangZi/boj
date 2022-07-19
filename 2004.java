import java.io.*;
import java.util.*;

//2004
public class test {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int num_two = get(n, 2) - get(m, 2) - get(n-m, 2);
        int num_five = get(n, 5) - get(m, 5) - get(n-m, 5);

        System.out.println(Math.min(num_two, num_five));



	}
    static int get(int n, int m){
        int num = 0;

        while(n >= m){
            num += n/m;
            n /= m;
        }
        return num;
    }

    
}
