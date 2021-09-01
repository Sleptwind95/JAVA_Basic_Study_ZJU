package sacnnertest;
import java.util.Scanner;
public class SacnnerTest3 {
    public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int power=0;
		int power_max=0;
		int[]ABC = new int[3];
		   for(int i=0;i<3;i++)
		   {
			   ABC[i]=in.nextInt();
		   }
			int M=ABC[0];
			int N=ABC[1];
			int O=ABC[2];
			int[] A = new int[M];
			int[] B = new int[N];
			int[] C = new int[O];
		   for(int i=0;i<M;i++)
		   {
			   A[i]=in.nextInt();
		   }
		   for(int i=0;i<N;i++)
		   {
			   B[i]=in.nextInt();
		   }
		   for(int i=0;i<O;i++)
		   {
			   C[i]=in.nextInt();
		   }
        }
    }
    
