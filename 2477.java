import java.io.*;


//2477번
public class test {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int per = Integer.parseInt(br.readLine());
        /// 입력 시 방향, 길이를 저장할 배열 dir, len
        int[] dir = new int[6];
        int[] len = new int[6];
        int width = 0, height = 0;
        int m_width = -1, m_height = -1; /// 최대길이 인덱스 저장 용도

        for(int i=0; i<6; i++){
            String[] temp = br.readLine().split(" ");
            dir[i] = Integer.parseInt(temp[0]);
            len[i] = Integer.parseInt(temp[1]);
            if(dir[i]==4 || dir[i]==3){
                if(height < len[i]){
                    height = len[i];
                    m_height = i;
                }
            }else{
                if(width < len[i]){
                    width = len[i];
                    m_width = i;
                }
            }
        }
        int result = per*(height*width -len[(m_height+3)%6]*len[(m_width+3)%6]);
        System.out.println(result);
        
    }
}

