import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11724 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        A=new ArrayList[node+1];
        visited = new boolean[node+1];
        for (int i = 1; i <node+1 ; i++) {
            A[i]=new ArrayList<Integer>();
        }

        for (int i = 1; i < edge; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);
            A[end].add(start);
        }
        int count = 0;
        for (int i = 1; i <node+1 ; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }

        }
        System.out.println(count);
        
    }

    private static void DFS(int i) {
        if(visited[i]){
            return;
        }
        visited[i]=true;
        for(int t : A[i]){
            if(!visited[t]){
                DFS(t);

            }
        }

    }
}
