package week4;
import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner in = new Scanner (System.in);
		System.out.print("��������Ŀ�ţ�");
		select = in.nextInt();
		if (select == 1)
		{
			int n=0;
			int m=0;
			int sum=0;
			int number=2;
			boolean factor=false;
			System.out.print("������n��ֵ��");
			n = in.nextInt();
			System.out.print("������m��ֵ��");
			m = in.nextInt();
			int count=m-n+1;
			int origin_n=n;
			if(0<n&&m<=200&&n<=m)
			{
			do
				{
//				++++++++���²��������ж��Ƿ�Ϊ����+++++++++
					if(number==2)//2��ֱ�����������
					{
						factor=true;
					}
					for (int j = 2; j < number; j++) //�ж��Ƿ�Ϊ����
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
//					++++++++�ж�����ģ�����+++++++++
						if (factor)//�������������������ǰn��
						{
//							i++;System.out.println("��"+i+"������:"+number);
							origin_n--;
							if(origin_n<=0)
							{
								sum+=number;
//								System.out.println("��������:"+count);
								count--;
							}
						}
					number++;
				}while(count>0);
			System.out.println("��"+n+"�������͵�"+m+"������֮�����������ĺ�Ϊ:"+sum);
			}
			else
			{
				System.out.println("���������������");
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
			System.out.print("������һ��������");
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
				System.out.println("���������������");
			}
		}
	}
}
