import java.util.*;
public class Sum {
public static void main(String[]args){
	int a,p=0,q=0,i,j;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<a;i++){
		p=p+arr[i];
	}for(i=0;i<a;i++){
		j=p%10;
		q=q+j;
		p=p/10;
	}
	System.out.println(q);
}
}