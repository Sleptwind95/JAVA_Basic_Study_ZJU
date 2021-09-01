package week7;
import java.util.Scanner;
public class test_7_2 {
//	题目内容：
//	一个正整数的因子是所有可以整除它的正整数。而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。
//	现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。
//	提示：可以写一个函数来判断某个数是否是完数。
//	输入格式:两个正整数，以空格分隔。
//	输出格式：其间所有的完数，以空格分隔，最后一个数字后面没有空格。如果没有，则输出一个空行。
//	输入样例：1 10
//	输出样例：6
	
	public static boolean isPerfect(int n) {
		int sum=0;
		boolean Perfect=false;
		for (int i = 1;i < n; i++) //非素数因式分解
		{
			if(n%i==0)
			{
				sum+=i;
//					System.out.println("i="+i);
//					System.out.println("n="+n+"%");
			}
        }
//		sum+=1;
//		System.out.println(sum);
		if (sum==n)
		{
			Perfect=true;
		}
		return Perfect;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n=0;
		int m=0;
		System.out.println("请输入n的值：");
		n=in.nextInt();
		System.out.println("请输入m的值：");
		m=in.nextInt();
//		System.out.print(isPerfect(n));
		for (int i = n; i <= m; i++) 
		{
			if(isPerfect(i))
			{
				System.out.print(i+"/");
			}
		}
		
	}

}
