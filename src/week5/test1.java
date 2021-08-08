package week5;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int size=100;
		int coe=0;
		int power=0;
		int power_max=0;
		int[] coe_1 = new int[size];
		int[] coe_2 = new int[size];
//		int[] power_1=new int[size];
//		int[] power_2=new int[size];
		System.out.println("请依次输入第一个多项式的幂次和系数：");
		for(int i=0;i<coe_1.length;i++)
		{
			power = in.nextInt();
			coe = in.nextInt();
			coe_1[power]=coe;
			if(power_max<power)
			{
				power_max=power;
			}
			if (power==0)
			{
				break;
			}
			
		}
		System.out.println("请依次输入第二个多项式的幂次和系数：");
		for(int i=0;i<coe_2.length;i++)
		{
			power = in.nextInt();
			coe = in.nextInt();
			coe_2[power]=coe;
			if(power_max<power)
			{
				power_max=power;
			}
			if (power==0)
			{
				break;
			}
			
		}

		for(int i=0;i<=power_max;i++)
		{
			coe_1[i] += coe_2[i];
//			System.out.println(i+":"+coe_1[i]);
		}
//		System.out.println(power_max);
		System.out.println("这两个多项式的和为：");
		while(power_max>=0)
		{
			if(power_max>1)
			{
				if(coe_1[power_max]>0)
				{
					System.out.print(coe_1[power_max]+"x^"+power_max+"+");
				}
			}
				if(power_max==1 && coe_1[power_max]>0)
				{
					System.out.print(coe_1[power_max]+"x"+"+");
				}	
				if(power_max==0 && coe_1[power_max]>0)
				{
					System.out.print(coe_1[power_max]);
				}
			power_max=power_max-1;
		}
//		System.out.println("幂次:"+power+"系数:"+coe);
	}

}
