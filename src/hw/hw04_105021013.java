package hw;
import java.util.Scanner;
public class hw04_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入1或2或3或4");
        int a = scn.nextInt();
        
        int n=0;
		switch(a)
		{
		case 1:
	        System.out.println("輸入n:");
			 n=scn.nextInt();
			 for(int i=n-(n-1)/2;i>0;i--)
				{

			 for(int j=1;j<=i;j++)
			 {
						System.out.print("@");
					}
			 System.out.println();
				}
			 for(int i=1;i<=(n-1)/2;i++)
				{
					for(int j=0;j<=i;j++){
						System.out.print("@");
					}
					 System.out.println();
				}
			
			 
			 break;
			 
			 
		case 2:
	        System.out.println("輸入n:");
			 n=scn.nextInt();
			 for(int i=1;i<=(n-1)/2;i++)
				{
					for(int j=1;j<=i;j++){
						System.out.print("%");
					}
					 System.out.println();
				}
			 for(int i=n-(n-1)/2;i>0;i--)
				{

			 for(int j=1;j<=i;j++)
			 {
						System.out.print("%");
					}
			 System.out.println();
				}
			 
			 
			 break;
		case 3:
			System.out.println("輸入n(必須是奇數):");
			 n=scn.nextInt();
			 n=(n-1)/2+1;
			 for(int i=1; i<=n; i++)
	          {
	               for(int j=1; j<=n-i; j++)
	               {
	                    System.out.print(" ");
	               }
	               for(int k=1; k<=i*2-1; k++)
	               {
	                    System.out.print("#");
	               }
	               System.out.println();
	          }
	          for(int i=1; i<=(n-1); i++)
	          {
	               for(int j=1; j<=i; j++)
	               {
	                    System.out.print(" ");
	               }
	               for(int k=1; k<=(2*n)-(2*i)-1; k++)
	               {
	                    System.out.print("#");
	               }
	               System.out.println();
	          }
			 break;
		case 4:
			
		default:
			System.out.println("結束程式");
		break;
		}
	}

}
