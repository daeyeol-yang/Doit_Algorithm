import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int data =Integer.parseInt( st.nextToken());
        st = new StringTokenizer(br.readLine());
        int []dataArray = new int[data];
        for (int i = 0; i < data; i++) {
            dataArray[i]=Integer.parseInt(st.nextToken());

        }
        Arrays.sort(dataArray);
        st= new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        
        
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < P; i++) {
            boolean result =false;
            int target = Integer.parseInt(st.nextToken());
            int start=0;

            int end = dataArray.length-1;

            while (start<=end){
                int divi = (start+end)/2;
                int midV = dataArray[divi];
                if(target>midV){
                    start=divi+1;
                } else if (target<midV) {
                    end=divi-1;
                }else{
                    result=true;
                    break;
                }
            }
            if(result){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
