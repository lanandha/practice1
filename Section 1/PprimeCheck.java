package ad;
import java.util.Scanner;
public class PprimeCheck {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count3=0;
		int count4=0;
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=Integer.toString(arr[i]).length();
		}
		for(int i=0;i<n;i++){
			if(arr[i]>10 && arr[i]<10000){
				count4++;
			}
		}
		System.out.println(count4);
		int y=Integer.toString(arr[0]).length();
		int []rem=new int[y];
		int k=y-1;
	      int []out=new int[y];
	      int o=0;
			int temp=arr[0];
			while(temp!=0){
				rem[k]=temp%10;
				k--;
				temp/=10;
			}
		for(int i=0;i<y;i++){
			int count=0;
			for(int j=1;j<=rem[i];j++){
				if(rem[i]%j==0){
					count++;
				}
			}
			if(count==2){
				out[o]=rem[i];
				o++;
			}
		}
	int []rem1=new int[10];
		for(int i=0;i<n;i++){
			int p=0;
			int temp1=arr[i];
			while(temp1!=0){
			rem1[p]=temp1%10;
			p++;
			temp1/=10;
			}
			int c=0;
			for(int j=0;j<o;j++){          
				for(int x=0;x<p;x++){
				if(out[j]==rem1[x]){
					c++;
				}
			}
				if(c==1){
					count3++;
				}
		}
		}
		int sum1=0;
		if((n)==count3){
			for(int i=0;i<o;i++){
			sum1+=out[i];
			}
			int r=sum1;
			while(r>9){
				int s=r%10;
				r/=10;
				sum1=s+r;
				r=sum1;
				}
		
			//System.out.println(sum1);
			for(int i=sum1;;i++){
				int c1=0;
				for(int j=1;j<=i;j++){
					if(i%j==0){
						c1++;
					}
				}
				if(c1==2){
					System.out.println(i);
					break;
				}
				}
		}
		else if(n==count4){
			System.out.println("-999");
		}
		else{
			System.out.println("-99");
		}
	}
	}
