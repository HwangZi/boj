import java.io.*;
import java.util.*;


//18870번
public class boj {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
      
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        int[] listClone = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<num; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        listClone = list.clone();
        Arrays.sort(listClone);

        int rank = 0;
        for(int a : listClone){
            if(!map.containsKey(a)){
                map.put(a, rank);
                rank++;
            }
        }

        for(int a : list){
            int ranking = map.get(a);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);
    }
}

