package week2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner in = new Scanner (System.in);
		System.out.print("��������Ŀ�ţ�");
		select = in.nextInt();
		if (select == 1)
		{
			int UTC=0;
			int BTJ;
			System.out.println("***����ʱ��-����Э��ʱ�任����***");
			System.out.print("�����뱱��ʱ�䣺");
			BTJ = in.nextInt();
			if (BTJ>2359)
				{
					System.out.println("***ʱ���ʽ�������***");
				}
			else if(BTJ>=800)
				{
					UTC=BTJ-800;
				}
			else if(BTJ>=0)
				{
					UTC=BTJ+1600;
				}
			else
				{
					System.out.println("***ʱ���ʽ�������***");
				}
			System.out.println("����Э��ʱ�䣺"+ UTC );
			}
		else
		{
			int RS;
			int Readability;
			int Strength;
			System.out.println("***�źű�������***");
			RS = in.nextInt();
			Readability = RS/10;
			Strength = RS%10;
			if(RS>59)
			{
				System.out.println("***�����ʽ�������***");
			}
			else if (RS>=11)
			{
				switch (Strength) 
				{
				case 1:
					System.out.print("Faint signals, barely perceptible");
					break;
				case 2:
					System.out.print("Very weak signals");
					break;
				case 3:
					System.out.print("Weak signals");
					break;
				case 4:
					System.out.print("Fair signals");
					break;
				case 5:
					System.out.print("Fairly good signals");
					break;
				case 6:
					System.out.print("Good signals");
					break;
				case 7:
					System.out.print("Moderately strong signals");
					break;
				case 8:
					System.out.print("Strong signals");
					break;
				case 9:
					System.out.print("Extremely strong signals");
					break;
				}
				System.out.print(", ");
				switch (Readability) 
				{
				case 1:
					System.out.print("unreadable");
					break;
				case 2:
					System.out.print("barely readable, occasional words distinguishable");
					break;
				case 3:
					System.out.print("readable with considerable difficulty");
					break;
				case 4:
					System.out.print("readable with practically no difficulty");
					break;
				case 5:
					System.out.print("perfectly readable");
					break;
				}
				System.out.print(".");
			}
		}
	}
	}

