package week7;
import java.util.Scanner;
public class test_7_1 {
//��Ŀ���ݣ�
//
//ÿ����������������������д�ɼ���������Ҳ�ɳ�Ϊ��������˵���ʽ���⼸�������Ͷ�������������������������磬6���Ա��ֽ�Ϊ2x3����24���Ա��ֽ�Ϊ2x2x2x3��
//���ڣ���ĳ���Ҫ����һ��[2,100000]��Χ�ڵ�������Ȼ����������������ֽ�ʽ���������ľ�������ʱ�����������

//�����ʽ:
//һ����������Χ��[2,100000]�ڡ�
	
//�����ʽ��
//���磺
//n=axbxcxd
//��
//n=n
//���еķ���֮�䶼û�пո�x��Сд��ĸx��
	
//����������
//18
//���������
//18=2x3x3
	public static boolean factor(int number) {
		boolean factor=false;
		if(number==2)//2��ֱ�����������
		{
			factor=true;
		}
		for (int i = 2; i < number; i++) //�ж��Ƿ�Ϊ����
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
		System.out.print("������ֵ��");
		int number=in.nextInt();
		n=number;
//		System.out.print(factor(number));
		if(factor(number))
		{
		System.out.println(number+"������");
		}
		else
		{
			System.out.print(number+"=");
			for (int i = 2;i <= n; i++) //��������ʽ�ֽ�
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
