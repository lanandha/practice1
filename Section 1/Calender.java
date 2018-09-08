package ad;
import java.util.Calendar;
public class Calender {
	public static void main(String[] args){
	 Calendar c = Calendar.getInstance();
     System.out.println("Current Date and Time :"); 
     System.out.format("%tB %te, %ty%n", c, c, c);
     System.out.format("%tl:%tM %tA%n", c, c, c); 
	}
}
