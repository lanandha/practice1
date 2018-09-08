import java.util.*;
public class Square {
 public static void main(String[]args){
	 int N;
	 Scanner sc = new Scanner(System.in);

	 long sum = 0;

	 N = sc.nextInt();

	 for (int i = 0; i < N; i++) {

	 final long x = sc.nextLong(); // read input

	 String str = Long.toString((long) Math.pow(1 << 1, x));

	 str = str.length() > 2 ? str.substring(str.length() - 2) : str;

	 sum += Integer.parseInt(str);

	 }

	 System.out.println(sum%100);
 }
}
