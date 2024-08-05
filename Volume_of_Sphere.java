import java.util.Scanner;
public class Sphere{
    public static void main(String[] args){
        int r;
        Scanner read =new Scanner(System.in);
        r=read.nextInt();
        double volume=(4/3.0)*3.14*r*r*r;
        System.out.printf("%.2f",volume);
    } 
}