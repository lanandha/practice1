package ad;

	import java.io.*;
	import  java.util.*;
import java.util.Scanner;
	// Read only region start
	public class NumCount{ 
		public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int input1=sc.nextInt();
          int input2=sc.nextInt();

			// Read only region end
			// Write code here...
			int input;
			int result=0;
			if(input2==1){
				for(int i=0;i<input1;i++){
					if(i==0){
					input=(input1-i);
						result+=input;
					}
					else if(i%2==0){
						input=(input1-i);
						result+=input;
					}
					else{
						input=input1-i;
						result-=input;
					}
				}
			}
			else if(input2==2){
				for(int i=0;i<input1;i++){
					if(i==0){
						input=input1-i;
						result=input;
					}
					 else if(i%2==0){
						input=input1-i;
						result-=input;
					}
					else{
						input=input1-i;
						result+=input;
					}
				}
			}
			System.out.println(result);
			
		}
	}


