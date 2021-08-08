package week3;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner in = new Scanner (System.in);
		System.out.print("请输入题目号：");
		select = in.nextInt();
		if (select == 1)
		{
			int number=0;
			int odd =0;
			int even =0;
			System.out.print("请输入一系列正整数：");
			number = in.nextInt();
			while(number != -1)
			{
				if (number%2==1)
				{
					odd=odd+1;
				}else
				{
					even=even+1;
				}
				number = in.nextInt();
			}
			System.out.println("奇数的个数为："+odd);
			System.out.println("偶数数的个数为："+even);
		}
		else 
		{
//		    int max=1000000,min=0;
//		    int random = (int) (Math.random()*(max-min)+min); 
		    int random=0;
		    int array=0;
		    int position=0;
		    int resolution=0;
		    int number=0;
			System.out.print("请输入[0,1000000]内的随机数：");
			if(random <=1000000 && random>=0)
			{
			random = in.nextInt();
			do 
			{
		    resolution= random%2;
		    array++;
		    position=array%2;
		    random=random/10;
		    if(resolution==position)
		    	{	
		    		number=number+(int)Math.pow(2,array-1);
		    	}
			}
		    while(random!=0);
			System.out.println("奇偶性位值计算结果："+number);
			}
		}
	}
}
