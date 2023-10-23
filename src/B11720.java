import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();

        String sNum =sc.next();
        char []Num = sNum.toCharArray();
        int sum=0;
        for(int i=0; i< Num.length ; i++){
            sum+=Num[i]-'0'; // char 타입을 int 타입으로 변경!!
        }
        System.out.println(sum);
    }
}
