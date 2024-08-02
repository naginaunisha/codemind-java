import java.util.Scanner;
public class numbers{
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        int sum;
        sum=(n*(n+1))/2;
        System.out.printf("%d",sum);
    }
}