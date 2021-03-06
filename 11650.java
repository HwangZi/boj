import java.io.*;
import java.util.*;


//11650번
public class boj {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken()); 
        }
        
        Arrays.sort(arr, (arr_1, arr_2) -> {
            if(arr_1[0] == arr_2[0]){
                return arr_1[1] - arr_2[1];
            }else{
                return arr_1[0] - arr_2[0];
            }
        });

        for(int i=0; i<num; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}

