package week1;
import java.util.Scanner;
public class Test1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Fahrenheit;
			System.out.println("华氏-摄氏温度转换器");
			System.out.print("请输入当前华氏温度：");
			Scanner in = new Scanner (System.in);
			Fahrenheit=in.nextInt();
			System.out.println("当前摄氏温度为："+(int)((Fahrenheit-32)*5/9)+"°C");
		}

}
