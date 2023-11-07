import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array= new int[N];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            array[i]=sc.nextInt();

        }

        int num =1;
        boolean check = true;

        for (int i = 0; i < N; i++) {
            if(array[i]>=num){
                while(array[i]>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");

            }else{
                int n= stack.pop();
                if(array[i]!=n){
                    System.out.println("No");
                    check =false;
                    break;
                }
                else{
                    sb.append("-\n");
                }

            }
        }
        if (check) {
            System.out.println(sb.toString());
        }
    }
}
