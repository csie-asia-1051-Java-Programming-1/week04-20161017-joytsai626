package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021013 蔡孟璇
 */
import java.util.Scanner;
public class ex01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        int n=0;
        
        while(a!=-1){
        	n=n+1;
        System.out.println("輸入整數:");
         a =scn.nextInt();
        sum = sum + a;
        }
        System.out.println(sum+1);
        System.out.println((sum+1)/(n-1));
        }
	}

