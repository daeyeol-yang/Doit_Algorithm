import java.util.Scanner;

public class B2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start =1;
        int last =1;
        int count =1;
        int sum =1;

        while(last!=N){
            if(sum==N){
                last++;
                count++;
                sum=sum+last;
            } else if (sum>N) {

                sum=sum-start;
                start++;

            }else {
                last++;
                sum=sum+last;
            }
        }
        System.out.println(count);
    }
}
