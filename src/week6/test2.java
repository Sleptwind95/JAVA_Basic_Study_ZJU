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
		System.out.println("������GPS��Ϣ��");
		for(int i=0;compare!=0;i++)
		{
		GPRMC[i] = in.nextLine();
        compare=GPRMC[i].compareToIgnoreCase("end");
		}
//		System.out.println(GPRMC[2]);//ָ������������������
		
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
//        System.out.println("#####");//�����#####����ʾ����ѭ��
		for(int i=0;i<correct.length;i++)//���㱱��ʱ��
		{
			if(GPRMC[correct[i]].startsWith("$GPRMC"))
			{
				count=size-1;//������count����
				time_final= new int [size];
			    String[] time_a=GPRMC[correct[i]].split(",", 3);//�½����鴮�����ֺ������
			    String time_data=time_a[1];
			    time_double = Double.valueOf(time_data.toString());
			    time=(int)time_double;
			    time_BTJ=time+80000;//ת��Ϊ����ʱ��
			    if(time_BTJ>240000)
			    {
			    	time_BTJ=time_BTJ-240000;
			    }
//		        System.out.println("TimeData:"+time_BTJ);//���������
				for(int j=0;j<time_final.length;j++)
			    {
					time_final[count]=time_BTJ%10;
					time_BTJ=time_BTJ/10;
					count--;
			    }
				System.out.println("����ʱ�䣺"+time_final[0]+""+time_final[1]+":"+time_final[2]+""+time_final[3]+":"+time_final[4]+""+time_final[5]);
			}
		}
	}
}
