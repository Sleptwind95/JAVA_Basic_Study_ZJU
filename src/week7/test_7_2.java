package week7;
import java.util.Scanner;
public class test_7_2 {
//	��Ŀ���ݣ�
//	һ�������������������п���������������������һ�������ǡ�õ��ڳ��������������֮�ͣ�������ͳ�Ϊ����������6=1��2��3(6��������1,2,3)��
//	���ڣ���Ҫдһ�����򣬶�������������n��m��1<=n<m<1000�������[n,m]��Χ�����е�������
//	��ʾ������дһ���������ж�ĳ�����Ƿ���������
//	�����ʽ:�������������Կո�ָ���
//	�����ʽ��������е��������Կո�ָ������һ�����ֺ���û�пո����û�У������һ�����С�
//	����������1 10
//	���������6
	
	public static boolean isPerfect(int n) {
		int sum=0;
		boolean Perfect=false;
		for (int i = 1;i < n; i++) //��������ʽ�ֽ�
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
		System.out.println("������n��ֵ��");
		n=in.nextInt();
		System.out.println("������m��ֵ��");
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
