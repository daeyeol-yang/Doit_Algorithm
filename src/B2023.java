import java.util.Scanner;

public class B2023 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

    }
    static void DFS(int number, int value){
        if(value==N){
            if(isPrime(number)){
                System.out.println(number);
            }
            return;
        }

        for (int i = 1; i <10 ; i++) {
            if(isPrime(number*10+i)){
                DFS(number*10+i,value+1);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i*i <= number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
