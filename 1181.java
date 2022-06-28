import java.io.*;
import java.util.*;


//1181번
public class boj {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<num; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        for(String a : list){
            System.out.println(a);
        }

    }
}

