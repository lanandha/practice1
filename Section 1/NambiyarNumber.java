package ad;
import java.util.Scanner;
public class NambiyarNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String []a=s.split("");
	    int []rem=new int[10];
	    for(int i=0;i<a.length;i++){
	    	int b=Integer.parseInt(a[i]);
	    	rem[i]=b;
	    }
	    int []arr=new int[10];
	    int x=0;
	    for(int i=0;i<a.length;i++){
	    	int sum=0;
	    		 if(rem[i]%2==0){
	    			for(int j=i;j<a.length;j++){
	    	    		sum+=rem[j];
	    			if(sum%2!=0 || j==a.length-1){
	    			arr[x]=sum;
    				//System.out.println(sum);

	    			x++;
	    			i=j;
	    			break;
	    		}
	    		}
	    	}
	        else{
	    		for(int j=i;j<a.length;j++){
	    			sum+=rem[j];
	    			if(sum%2==0 || j==a.length-1){
	    				arr[x]=sum;
	    				//System.out.println(sum);
	    				
	    				 
	    				
	    				
	    				

	    				x++;
	    				i=j;
	    				break;
	    			}
	    		}
	    	}
	    
	    }
	    for(int i=0;i<x;i++){
	    	System.out.println(arr[i]);
	    }
	
	    String str="";
	    int c=0;
	    for(int i=0;i<x;i++){
	    	str+=arr[i];
	    }
	    System.out.println(Integer.parseInt(str));
	    }

}
