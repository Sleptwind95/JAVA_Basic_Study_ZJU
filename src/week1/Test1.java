package week1;
import java.util.Scanner;
public class Test1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Fahrenheit;
			System.out.println("����-�����¶�ת����");
			System.out.print("�����뵱ǰ�����¶ȣ�");
			Scanner in = new Scanner (System.in);
			Fahrenheit=in.nextInt();
			System.out.println("��ǰ�����¶�Ϊ��"+(int)((Fahrenheit-32)*5/9)+"��C");
		}

}
