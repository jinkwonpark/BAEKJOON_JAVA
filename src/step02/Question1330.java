package step02;
import java.util.Scanner;
public class Question1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A>B){
            System.out.print(">");}
        else if (A<B){
            System.out.print("<");}
        else if (A==B){
            System.out.print("==");}
    }
}
