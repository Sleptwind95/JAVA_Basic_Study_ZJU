package week4;
import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner in = new Scanner (System.in);
		System.out.print("请输入题目号：");
		select = in.nextInt();
		if (select == 1)
		{
			int n=0;
			int m=0;
			int sum=0;
			int number=2;
			boolean factor=false;
			System.out.print("请输入n的值：");
			n = in.nextInt();
			System.out.print("请输入m的值：");
			m = in.nextInt();
			int count=m-n+1;
			int origin_n=n;
			if(0<n&&m<=200&&n<=m)
			{
			do
				{
//				++++++++以下部分用于判断是否为素数+++++++++
					if(number==2)//2则直接输出是素数
					{
						factor=true;
					}
					for (int j = 2; j < number; j++) //判断是否为素数
					{
						if(number%j==0)
						{
							factor=false;
				            break;
						}
						else
						{
							factor=true;
						}
			        }
//					++++++++判断素数模块结束+++++++++
						if (factor)//如果是素数，则先跳过前n轮
						{
//							i++;System.out.println("第"+i+"个素数:"+number);
							origin_n--;
							if(origin_n<=0)
							{
								sum+=number;
//								System.out.println("运算轮数:"+count);
								count--;
							}
						}
					number++;
				}while(count>0);
			System.out.println("第"+n+"个素数和第"+m+"个素数之间所有素数的和为:"+sum);
			}
			else
			{
				System.out.println("您输入的数据有误");
			}
		}
		else
		{
			int number=0;
//			int re_number=0;
			int count=1;
			int i =0;
			int reserve=0;
			int array=1;
			System.out.print("请输入一个整数：");
			number = in.nextInt();
			if(number>=-10000||number<=10000)
			{
				if(number<0)
				{
					System.out.print("fu ");
					number=-number;
				}
		    	for(int j=10;j<number;j*=10)
		    	{
		    		array=array*10;
		    	}
			    do
			    {
			    	for(int j=10;j<number;j*=10)
			    	{
			    		count=count*10;
			    	}
				    reserve=number % count;
				    array=array/10;
					i = (number-reserve) /  count;
				    if(array>reserve)
				    {
						 i = (number-reserve) /  count;
				    }		   
//					System.out.println("number:"+number);
//					System.out.println("reserve:"+reserve);
//			    	System.out.println("array:"+array);
//					System.out.println("count:"+count);
				    switch(i)
				      {
				         case 0:
				            System.out.print("ling"); break;
				         case 1:
				            System.out.print("yi"); break;
				         case 2:
				            System.out.print("er"); break;
				         case 3:
				            System.out.print("san"); break;
				         case 4:
				            System.out.print("si"); break;
				         case 5:
				            System.out.print("wu"); break;
				         case 6:
				            System.out.print("liu"); break;
				         case 7:
				            System.out.print("qi"); break;
				         case 8:
				            System.out.print("ba"); break;
				         case 9:
				            System.out.print("jiu"); break;
				      }
				    if(array>reserve)
				    {
				    	 System.out.print(" ");
				    }	
				    while(array>reserve)
				    {
				    	 System.out.print("ling");
				    	 array=array/10;
				    	 if (array> reserve)
				    	 {
				    		 System.out.print(" ");
				    	 }
				    }
				    number=number% count;
				    if(number!=0)
				    {
				    	System.out.print(" ");
				    }
				    count=1;
			    }while(number>0);

			}
			else
			{
				System.out.println("您输入的数据有误");
			}
		}
	}
}
