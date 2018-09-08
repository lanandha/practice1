package ad;
import java.util.*;
public class Bharani {
public static void main(String[] args)
{
	int n;
	int []temp=new int [50];
	int k=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int count=0;
		
	for(int j=0;j<=i;j++)
	{
		
		if(a[i]==a[j])
		
		count++;
		
	}
	
	if(count==1)
	{
		
		temp[k]=a[i];
		
		k++;
	}
	}
	
	
	int max=0;
	int max1=0;
	int b=0;
	for(int i=0;i<k;i++){
		int count1=0;
		for(int j=0;j<n;j++){
			if(temp[i]==a[j]){
				count1++;
			}
		}
		if(count1>max){
			max=count1;
			b=i;
		}
	}
		
	for(int i=0;i<n;i++){
		
			if(a[i]>max1){
				max1=a[i];
			}
		
	}
	System.out.print(max1);
	
	
	

	
	}
}


