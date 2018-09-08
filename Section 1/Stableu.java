package ad;

public class Stableu {
	public static void main(String[] args){
		int pwd=0,lng=0,prev=0,a[]={12,1313,122,678,898};//{input1,input2,input3,input4,input5};
		for(int i=0;i<5;i++){
			String s=String.valueOf(a[i]);
			prev=0;
			while(s.length()!=0){
				String s1=s.replace(String.valueOf(s.charAt(0)),"");
				lng=s.length()-s1.length();
				if(prev!=0&&prev!=lng){
					pwd=pwd-a[i];
					break;
				}
				prev=lng;
				s=s1;
			}
			if(prev==lng)	pwd=pwd+a[i];
		}
		System.out.println(pwd);
	}
}


