package VehicleR;
import java.util.*;
import java.text.*;

public class DateExample {

	public static void main(String []args) throws ParseException 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Date in format : ");
		String d = kb.nextLine();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(d);
		System.out.println(date);
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("date");
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		*/
		Date datetoday = Calendar.getInstance().getTime();
		
	    int diffInDays = (int) ((datetoday.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
	    
	    System.out.println(diffInDays);
	}
		
	
}
