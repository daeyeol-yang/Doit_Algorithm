import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.management.InstanceNotFoundException;

public class B1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int []array = new int[N];
        int count =0;
        for (int i = 0; i < N; i++) {
            array[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            int end = array[i];
            int start=0;
            int last = N-1;

            while(start<last){
                if(end==array[start]+array[last]){
                    if(start!=i&&last!=i){
                        count++;
                        break;
                    } else if (start==i) {
                        start++;
                    } else if (last==i) {
                        last--;
                    }
                } else if (end>array[start]+array[last]) {
                    start++;
                }else{
                    last--;
                }
            }

        }
        System.out.println(count);
    }
}
