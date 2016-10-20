package hw;
import java.util.Scanner;
public class hw02_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("輸入正整數n:");
       int n = scn.nextInt();
       System.out.println("輸入正整數m:");
       int m = scn.nextInt();
       int v = (n-m);
       int a = 1;
       int b = 1;
       
       for(int i=1; i<=n; i++)
       {
        a=i*a;
       }
       for(int i=1; i<=m; i++)
       {
        b=i*b;
       }
       
       System.out.println(a/(b*v));
	}

}
