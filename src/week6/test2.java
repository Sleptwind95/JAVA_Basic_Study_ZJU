package week6;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] GPRMC= new String[10];
		for(int i=0;i<GPRMC.length;i++)
		{
			GPRMC[i]="NO DATA";
		}
		int[] correct= new int[10];
		int compare=1;
		int count=0;
		double time_double=0;
		int time=0;
		int time_BTJ=0;
		int size=6;
		int[] time_final=new int [size];
//		int j=0;
//		boolean flag=false;
		System.out.println("请输入GPS信息：");
		for(int i=0;compare!=0;i++)
		{
		GPRMC[i] = in.nextLine();
        compare=GPRMC[i].compareToIgnoreCase("end");
		}
//		System.out.println(GPRMC[2]);//指定行数的输出测试语句
		
		for(int j=0;j<correct.length;j++)
		{
			while(count<GPRMC.length)
			{
//				System.out.println("count:"+count);
				if(GPRMC[count].startsWith("$GPRMC"))
				{
					correct[j] = count;
//					System.out.println(GPRMC[correct[j]]);
//					System.out.println(count+"&"+j);
					count++;
					break;
				}
				count++;
			}
		}
//        System.out.println("#####");//输出：#####，表示跳出循环
		for(int i=0;i<correct.length;i++)//计算北京时间
		{
			if(GPRMC[correct[i]].startsWith("$GPRMC"))
			{
				count=size-1;//计数器count复用
				time_final= new int [size];
			    String[] time_a=GPRMC[correct[i]].split(",", 3);//新建数组串保存拆分后的数组
			    String time_data=time_a[1];
			    time_double = Double.valueOf(time_data.toString());
			    time=(int)time_double;
			    time_BTJ=time+80000;//转换为北京时间
			    if(time_BTJ>240000)
			    {
			    	time_BTJ=time_BTJ-240000;
			    }
//		        System.out.println("TimeData:"+time_BTJ);//测试用语句
				for(int j=0;j<time_final.length;j++)
			    {
					time_final[count]=time_BTJ%10;
					time_BTJ=time_BTJ/10;
					count--;
			    }
				System.out.println("北京时间："+time_final[0]+""+time_final[1]+":"+time_final[2]+""+time_final[3]+":"+time_final[4]+""+time_final[5]);
			}
		}
	}
}
