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
//            System.out.println(str.charAt(i)); //charAt(i)方法 返回str串处于i位置上的字符,遍历整个str串，输出输入数据
//        }
        //对String进行split之后的数组的输出
        String[] tt=str.split("\\s+");//新建数组串保存拆分后的数组
        for(String s:tt)
        {
            System.out.print(s.length());
            System.out.print(" ");
        }
//        System.out.println("#####");//输出：#####，表示输出结束
	}
}
