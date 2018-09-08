package ad;
import java.util.Arrays;
import java.util.Scanner;
public class Stable {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	//	int len=Integer.toString(arr[i].length());
		}
		int l=0;
		int w=1;
		int o=0;
		int []arr2=new int[n];
		int []arr3=new int[n];
		int []rem=new int[10];
		int []rem1=new int[10];
		int []rem2=new int[10];
		int []arr1=new int[10];
		int []count1=new int[10];
           for(int e=0;e<n;e++){
        	   if(arr[e]==0){
        		   arr2[l]=arr[e];
        		   l++;
        	   }
        	   int k=0;
        	   int temp=arr[e];
			while(temp!=0){
				rem[k]=temp%10;
				k++;
				temp/=10;
				}	
			int h=0; 
			for(int j=0;j<k;j++){
				int count=0;
				for(int m=0;m<=j;m++){
					if(rem[j]==rem[m]){
						count++;
						}
					}
				if(count==1){
					arr1[h]=rem[j];
					h++;
				}
			}
			int d=0;
			for(int i=0;i<h;i++){
				int count3=0;
			    for(int j=0;j<k;j++){
			    	if(arr1[i]==rem[j]){
			    		count3++;
			    	}
			    }
			    	if(count3>0){
			    		count1[d]=count3++;
			    		d++;
			    	}
			    	}
			    int count2=0;
			for(int i=0;i<d;i++){
				if(count1[i]==count1[i+1]){
					count2++;
				}
				}
           if(count2==d-1){
        	   //System.out.println(arr[e]+"is stable");
        	   arr2[l]=arr[e];
                 l++;        	   
           }
           else{
        	  // System.out.println(arr[e]+" is unstable");
			arr3[o]=arr[e];
			o++;
		}
           
         }
             Arrays.sort(arr2);
            int max=arr2[arr2.length-1];
           Arrays.sort(arr3);
           int min=0;
           for(int i=0;i<arr3.length;i++){
        	   if(arr3[i]==0){
        		   continue;
        	   }
        	   else{
        		   min=arr3[i];
        		   break;
        	   }
           }
           System.out.println(max);
           System.out.println(min);
       /*    int max=0;
           for(int i=0;i<l;i++){
        	   if(arr2[i]>max){
        		  max=arr2[i]; 
        	   }
           }*/
          
        /*   for(int i=0;i<o;i++){
        	   for(int j=i+1;j<o;j++){
        	   if(arr3[i]>arr3[j]){
        		   int temp=arr3[j];
        		   arr3[j]=arr3[i];
        		   arr3[i]=temp;
        	   }  
        	   }
        	    System.out.println(arr3[i]);
	}*/
        	  System.out.print(max+min);
           
          /* int x=0;
           for(int i=0;i<l;i++){
        	   int temp=arr2[i];
        	   while(temp!=0){
        		   rem1[x]=temp%10;
        		   x++;
        		   temp/=10;                                                                                                                                
        	   }
          }
           int y=0;
           for(int i=0;i<o;i++){
        	   int temp=arr3[i];
        	   while(temp!=0){
        		   rem2[y]=temp%10;
        		   y++;
        		   temp/=10;
        	   }
            }
           int max=0;
           for(int i=0;i<x;i++){
        	  if(rem1[i]>max){
        		  max=rem1[i];
        		    }
           }
           System.out.println(max);
           int min=9;
           for(int i=0;i<y;i++){
        	  if(rem2[i]<min){
        		  min=rem2[i];
        		 }
           }
           System.out.println(min);
          System.out.print(max+min);*/
	}
	}
