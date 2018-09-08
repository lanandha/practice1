import java.io.*;
import  java.util.*;

// Read only region start
public class Secondlastdigit {
//class UserMainCode

public static void main(String[]args){
	//public int secondLastDigitOf(int input1){
		// Read only region end
		// Write code here...
		 int a=0,b,c,input1;
		 Scanner sc=new Scanner(System.in);
		 input1=sc.nextInt();
		 b=Math.abs(input1);
		a=b%100;
		a/=10;
		
	System.out.println(a);
	}
}


