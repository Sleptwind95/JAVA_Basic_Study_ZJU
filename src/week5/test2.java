package week5;//3*3�ߴ����̣�����������һ����Ϊʤ��
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int size=3;
		int chesspiece=1;
		int victory_side=0;
		boolean victory=false;
		int [][] chessboard=new int[size][size];
		System.out.println("�������������ݣ�");
		for(int i=0;i<chessboard.length;i++)//����������������
		{
			for(int j=0;j<chessboard[i].length;j++)
			{
				chessboard[i][j]=in.nextInt();
			}
//			System.out.println();//ÿ����һ������
		}
//		for(int i=0;i<chessboard.length;i++)//��������������ݣ�������
//		{
//			for(int j=0;j<chessboard[0].length;j++)
//			{
//				System.out.print(chessboard[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//�ж������Ƿ�������
		
		for(int i=0;i<chessboard.length;i++)//������������������
		{
			for(int j=0;j<(chessboard[i].length-1);j++)
			{
				if(chessboard[i][j]==chessboard[i][j+1])
				{
					victory_side=chessboard[i][j];
					chesspiece++;
				}
				else
				{
					chesspiece=1;//���ü�����
					break;
				}
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		
		for(int j=0;j<chessboard.length;j++)//������������������
		{
			for(int i=0;i<(chessboard[j].length-1);i++)
			{
				if(chessboard[i][j]==chessboard[i+1][j])
				{
					victory_side=chessboard[i][j];
					chesspiece++;
				}
				else
				{
					chesspiece=1;//���ü�����
					break;
				}
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		chesspiece=1;//���ü�����
		
		for(int i=0,j=0;i<(chessboard.length-1);i++,j++)		//�������ұ������̶Խ���
		{
			if(chessboard[i][j]==chessboard[i+1][j+1])
			{
				victory_side=chessboard[i][j];
				chesspiece++;
			}
			else
			{
				chesspiece=1;//���ü�����
				break;
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		for(int i=0,j=(size-1);i<(chessboard[i].length-1);i++,j--)		//��������������̶Խ���
		{
			if(chessboard[i][j]==chessboard[i+1][j-1])
			{
				victory_side=chessboard[i][j];
				chesspiece++;
			}
			else
			{
				chesspiece=1;//���ü�����
				break;
			}
			if(chesspiece==3)
			{
				victory=true;
			}
		}
		
		if(victory=true)
		{
			System.out.println("��Ӯ�ң�ʤ������"+victory_side+"��");
		}
		else
		{
			System.out.println("û��Ӯ��");
		}
	}
}
