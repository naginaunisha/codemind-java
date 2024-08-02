import java.util.Scanner;
public class cube{
    public static void main(String[] args){
        int s;
        Scanner read = new Scanner(System.in);
        s=read.nextInt();
        int a,v;
        a=6*s*s;
        v=s*s*s;
        System.out.printf("Surface area = %d and Volume = %d",a,v);
    }
}