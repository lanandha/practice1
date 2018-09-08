package ad;
import java.util.Scanner;
public class Logic {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem[]=new int[10];	
		int k=0;
		int count=0;
		while(n>0){
			rem[k]=n%10;
			k++;
			n/=10;
			count++;
		}
        for(int i=0;i<count;i++){
        	int count2=0;
        	int j;
        	int s=0;
	   for( j=0;j<k-1;j++){
		    s=rem[j]-rem[j+1];
		   if(s<0){
			   rem[j]=(-1)*s;
			  
		   }else{
			   rem[j]=s;
		   }
		   count2++;
		  }
	   if(count2==2){
			  int temp=0; 
			  temp=(temp*10)+rem[1];
			   temp=(temp*10)+rem[0];
			   System.out.print(temp);
			  
			   break;
		   }
		   else{
			   k--;
		  }
	   
        }		
	}

}
