package week7;
import java.util.Scanner;
public class test_7_1 {
//题目内容：
//
//每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
//现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。

//输入格式:
//一个整数，范围在[2,100000]内。
	
//输出格式：
//形如：
//n=axbxcxd
//或
//n=n
//所有的符号之间都没有空格，x是小写字母x。
	
//输入样例：
//18
//输出样例：
//18=2x3x3
	public static boolean factor(int number) {
		boolean factor=false;
		if(number==2)//2则直接输出是素数
		{
			factor=true;
		}
		for (int i = 2; i < number; i++) //判断是否为素数
		{
			if(number%i==0)
			{
				factor=false;
	            break;
			}
			else
			{
				factor=true;
			}
        }
		return factor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n=0;
//		int m=0;
		System.out.print("请输入值：");
		int number=in.nextInt();
		n=number;
//		System.out.print(factor(number));
		if(factor(number))
		{
		System.out.println(number+"是素数");
		}
		else
		{
			System.out.print(number+"=");
			for (int i = 2;i <= n; i++) //非素数因式分解
			{
				if(factor(i))
				{
					if(n/i==1)
					{
						System.out.print(n);
						break;
					}	
					else if(n%i==0)
					{
						n=n/i;
						System.out.print(i+"x");
//						System.out.println("n="+n);
						i=1;
					}
				}
	        }
		}
	}

}
