package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double foot;
		double inch;
		Scanner in = new Scanner (System.in);
		foot=in.nextInt();
		inch=in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
	}

}
