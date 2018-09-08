package ad;

import java.util.Scanner;

class EncapTest { 

	   public int gAge(int agge) {
	      return agge;
	   }

	   public String gName(String namme) {
	      return namme;
	   }
	   public String gIdNum(String idnNum) {
	      return idnNum;
	   }
	}
public class Lvhgfg {
	public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      encap.gName("James");   
	      int s=encap.gAge(n);
	      encap.gIdNum("12343ms");

	      System.out.print("Name : " +" Age : "+s );
	   }
	}


