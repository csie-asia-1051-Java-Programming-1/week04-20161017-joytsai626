package hw;
import java.util.Scanner;
public class hw03_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		while(true)
		{
			int a=scn.nextInt();
			if(a<0)
			{
				z++;
			}
			else if(a==0)
			{
				y++;
			}
			else if(a==999)
			{
				break;
			}
			else
			{
				x++;
			}
		}
		System.out.println("正整數有"+x+"個");
		System.out.println("零有"+y+"個");
		System.out.println("負數有"+z+"個");
	}

}
