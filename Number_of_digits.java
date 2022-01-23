import java.util.Scanner;
public class Number_of_digits {
}
class NumberofDigits{
    static int c =0;
 public static int digitscount(int n){
     if(n>0){
         c=c+1;
         digitscount(n/10);
     }
     return c;
 }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(digitscount(n));
    }
}
