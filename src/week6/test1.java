package week6;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
        str = in.nextLine();
        str = str.replace('.', ' ');
//		for (int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i)); //charAt(i)���� ����str������iλ���ϵ��ַ�,��������str���������������
//        }
        //��String����split֮�����������
        String[] tt=str.split("\\s+");//�½����鴮�����ֺ������
        for(String s:tt)
        {
            System.out.print(s.length());
            System.out.print(" ");
        }
//        System.out.println("#####");//�����#####����ʾ�������
	}
}
