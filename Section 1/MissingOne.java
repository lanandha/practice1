package ad;
import java.util.Scanner;
public class MissingOne {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   char  []arr=new char[n];
	    for(int i=0;i<n;i++){
	    	arr[i]=sc.next().charAt(0);
	    }
	    int b=0;
	    for(int i=0;i<n;i++){
	    	if(arr[i]=='?'){
	    		b=i;
	    	}
	    }
	    
		System.out.println(b);
	}

}
