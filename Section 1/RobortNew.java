package ad;
import java.util.Scanner;
public class RobortNew {
 public static void main(String[] args){
	 
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
   int pos=0;
   sc.nextLine();
   String cd=sc.nextLine();
   String mov=sc.nextLine();
   String out="";
   String cdsplit[]=cd.split("-");
   String movsplit[]=mov.split(" ");
   String dir=cdsplit[2];
   String direction[]={"N","E","S","W"};
   for(int i=0;i<movsplit.length;i++){
	   for(int j=0;j<direction.length;j++){
		   if(dir.equals(direction[j])){
			   pos=j;
			   break;
		   }
	   }
	   switch(movsplit[i]){
	   case "R":
		   if(pos==3){
			   dir="N";
		   }else{
		   dir=direction[pos+1];
		   }
		   break;
	   case "L":
		   if(pos==0){
			   dir="W";
		   }else{
		   dir=direction[pos-1];
		   }
		   break;
	   case "M":
		   if(dir.equals("E")){
			   cdsplit[0]=String.valueOf((Integer.valueOf(cdsplit[0]))+1);
		   }else if(dir.equals("W")){
			   cdsplit[0]=String.valueOf((Integer.valueOf(cdsplit[0]))-1);
		   }else if(dir.equals("N")){
			   cdsplit[1]=String.valueOf((Integer.valueOf(cdsplit[1]))+1);
		   }else{
			   cdsplit[1]=String.valueOf((Integer.valueOf(cdsplit[1]))-1);
		   }
		   break;
	   }
   }
   String last="";
   if(Integer.valueOf(cdsplit[0])>x || Integer.valueOf(cdsplit[1])>y||Integer.valueOf(cdsplit[0])<0||Integer.valueOf(cdsplit[1])<0 ){
	   last="ER";
	   if(Integer.valueOf(cdsplit[0])>x){
		   cdsplit[0]=String.valueOf(x);
	   }else if(Integer.valueOf(cdsplit[0])<0){
		   cdsplit[0]="0";
	   }else if(Integer.valueOf(cdsplit[1])<0){
		   cdsplit[1]="0";
	   }else{
		   cdsplit[1]=String.valueOf(y);
	   }
   }
   if(last=="ER"){
	   out=cdsplit[0]+"-"+cdsplit[1]+"-"+dir+"-"+last;
   }else{
	   out=cdsplit[0]+"-"+cdsplit[1]+"-"+dir;
	}
	System.out.println(out);	
	}
}


