import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
    static ArrayList<Integer>[] arrayList;
    static  boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  =  new StringTokenizer(br.readLine());
        int node  = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startnode = Integer.parseInt(st.nextToken());
        arrayList = new ArrayList[node+1];
        visited = new boolean[node+1];
        for (int i = 1; i <=node ; i++) {
            arrayList[i]=new ArrayList<>();
        }
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int start  = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arrayList[start].add(end);
            arrayList[end].add(start);

        }
        for (int i = 1; i <=node ; i++) {
            Collections.sort(arrayList[i]);
        }
        DFS(startnode);
        visited= new boolean[node+1];
        System.out.println();
        BFS(startnode);
    }

    private static void DFS(int node) {
        System.out.print(node+" ");
        visited[node]=true;
        for(int i : arrayList[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }

    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        visited[node]=true;
        queue.add(node);
        while (!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now+ " ");
            for(int i: arrayList[now]){
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);

                }
            }
        }

    }
}
