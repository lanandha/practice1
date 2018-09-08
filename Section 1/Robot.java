package ad;
import java.util.Scanner;
public class Robot {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		String cpos=sc.nextLine();
		String move=sc.nextLine();
		String[] arr=cpos.split("-");
		String[] arr1=move.split(" ");
		String[] dir={"N","E","S","W"};
		String dir1=arr[2];
		int pos=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<dir.length;j++){
				if(dir1.equals(dir[j])){
				pos=j;
				break;
				}
			}
			//System.out.println(dir1);
			switch(arr1[i]){
			case "R":
				if(pos==3){
					dir1="N";
					
				}
				else{
					dir1=dir[pos+1];
				}
				break;
			
			case "L":
				if(pos==0){
					dir1="W";
				}
				else{
					dir1=dir[pos-1];
				}
				break;
			
			case "M":
				if(dir1.equals("E")){
					arr[0]=String.valueOf((Integer.valueOf(arr[0]))+1);
				}
				else if(dir1.equals("W")){
					arr[0]=String.valueOf((Integer.valueOf(arr[0]))-1);
				}
				else if(dir1.equals("N")){
					arr[1]=String.valueOf((Integer.valueOf(arr[1]))+1);
				}
				else{
					arr[1]=String.valueOf((Integer.valueOf(arr[1]))-1);
				}
				break;
			
			}
		}
			String out="";
			String last="";
			if(Integer.valueOf(arr[0])>x || Integer.valueOf(arr[1])>y || Integer.valueOf(arr[0])<0 || Integer.valueOf(arr[1])<0){
				last="ER";
				if(Integer.valueOf(arr[0])>x){
					arr[0]=String.valueOf(x);
				}
				else if(Integer.valueOf(arr[1])>y){
					arr[1]=String.valueOf(y);
				}
				else if(Integer.valueOf(arr[0])<0){
					arr[0]="0";
				}
				else if(Integer.valueOf(arr[1])<0){
					arr[1]="0";
				}
			}
			if(last.equals("ER")){
				out+=arr[0]+"-"+arr[1]+"-"+dir1+"-"+last;
			}
			else{
				out+=arr[0]+"-"+arr[1]+"-"+dir1;
			}
			System.out.println(out);
		
	}

}
