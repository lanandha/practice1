package ad;
import java.util.Scanner;
public class RobertNew {
	public static void mai(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		String cdir=sc.nextLine();
		String move=sc.nextLine();
		String[] dir={"N","NE","E","SE","S","SW","W","NW"};
		String[] cmdir=cdir.split("-");
		String str=cmdir[2];
		String[] movedir=move.split(" ");
		int m=0;
		for(int i=0;i<movedir.length;i++){
			for(int j=0;j<dir.length;j++){
				if(str.equalsIgnoreCase(dir[j])){
					m=j;
				}
			}
		
		switch(movedir[i]){
		case "l":
			if(str.equals("N")){
				str="NW";
			}
			else{
			str=String.valueOf((Integer.valueOf(dir[m]))-1);	
			}
			break;
		case "L":
			 if(str.equals("N")){
				 str="W";
				 
				 
			 }
			 else{
				 str=String.valueOf((Integer.valueOf(dir[m]))-2);
			 }
			 break;
		case "r":
			if(str.equals("NW")){
				str="N";
			}
			else{
				str=String.valueOf((Integer.valueOf(dir[m]))+1);
			}
			break;
		case "R":
			if(str.equals("W")){
				str="N";
			}
			else{
				str=String.valueOf((Integer.valueOf(dir[m]))+2);
			}
			break;
		case "m":
			if(str.equals("E")){
			cmdir[0]=String.valueOf((Integer.valueOf(cmdir[0]))+1);
			}
			else if(str.equals("W")){
				cmdir[0]=String.valueOf((Integer.valueOf(cmdir[0]))-1);	
			}
			else if(str.equals("N")){
				cmdir[1]=String.valueOf((Integer.valueOf(cmdir[1]))+1);
			}
			else{
				cmdir[1]=String.valueOf((Integer.valueOf(cmdir[0]))-1);
			}
			break;
		case "M":
			if(str.equals("E")){
				cmdir[0]=String.valueOf((Integer.valueOf(cmdir[0]))+2);
				}
				else if(str.equals("W")){
					cmdir[0]=String.valueOf((Integer.valueOf(cmdir[0]))-2);	
				}
				else if(str.equals("N")){
					cmdir[1]=String.valueOf((Integer.valueOf(cmdir[1]))+2);
				}
				else{
					cmdir[1]=String.valueOf((Integer.valueOf(cmdir[0]))-2);
				}
				break;
		}
		}			
	}

}
