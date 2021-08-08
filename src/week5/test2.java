package week5;//3*3尺寸棋盘，有三个棋子一样即为胜利
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
		System.out.println("请输入棋盘数据：");
		for(int i=0;i<chessboard.length;i++)//输入整个棋盘数据
		{
			for(int j=0;j<chessboard[i].length;j++)
			{
				chessboard[i][j]=in.nextInt();
			}
//			System.out.println();//每输入一行则换行
		}
//		for(int i=0;i<chessboard.length;i++)//输出整个棋盘数据，测试用
//		{
//			for(int j=0;j<chessboard[0].length;j++)
//			{
//				System.out.print(chessboard[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//判断棋子是否有三连
		
		for(int i=0;i<chessboard.length;i++)//遍历整个棋盘所有行
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
					chesspiece=1;//重置计数器
					break;
				}
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		
		for(int j=0;j<chessboard.length;j++)//遍历整个棋盘所有列
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
					chesspiece=1;//重置计数器
					break;
				}
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		chesspiece=1;//重置计数器
		
		for(int i=0,j=0;i<(chessboard.length-1);i++,j++)		//从左向右遍历棋盘对角线
		{
			if(chessboard[i][j]==chessboard[i+1][j+1])
			{
				victory_side=chessboard[i][j];
				chesspiece++;
			}
			else
			{
				chesspiece=1;//重置计数器
				break;
			}
			if(chesspiece==3)
			{
				victory=true;
				break;
			}
		}
		
		for(int i=0,j=(size-1);i<(chessboard[i].length-1);i++,j--)		//从右向左遍历棋盘对角线
		{
			if(chessboard[i][j]==chessboard[i+1][j-1])
			{
				victory_side=chessboard[i][j];
				chesspiece++;
			}
			else
			{
				chesspiece=1;//重置计数器
				break;
			}
			if(chesspiece==3)
			{
				victory=true;
			}
		}
		
		if(victory=true)
		{
			System.out.println("有赢家，胜利的是"+victory_side+"方");
		}
		else
		{
			System.out.println("没有赢家");
		}
	}
}
