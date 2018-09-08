package ad;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
	String []str=input1.split(" ");
int len=str.length;
System.out.println(len);
if(len<2){
	System.out.println("less");
}
else{
	for(int i=0;i<len;i++){
		System.out.print(str[i]);
	}
	String str1=str[1].toUpperCase();
	System.out.println(str1);
}

}


}
