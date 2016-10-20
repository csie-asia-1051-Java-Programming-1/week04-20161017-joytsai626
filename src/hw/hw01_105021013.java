package hw;
import java.util.Scanner;
public class hw01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("輸入n:");
       int n = scn.nextInt();
       int a = 1;
       int b = 0;
       int sum = 0;
		for(int i = 1;i <= n;i++){
			sum = a + b;
			System.out.print(sum +" ");
			a = b;
			b = sum;
	}
	}
	}
