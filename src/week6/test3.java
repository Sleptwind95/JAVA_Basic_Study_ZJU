package week6;
import java.util.Scanner;
public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] GPRMC= new String[10];
		GPRMC[1] = new String("www.runoob.com");
        
        System.out.print("返回值 :" );
        System.out.println(GPRMC[1].startsWith("www") );
 
        System.out.print("返回值 :" );
        System.out.println(GPRMC[1].startsWith("runoob") );
 
        System.out.print("返回值 :" );
        System.out.println(GPRMC[1].startsWith("runoob", 4) );
	}
}
