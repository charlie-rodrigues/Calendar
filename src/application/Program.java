package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d = Date.from(Instant.parse("2022-04-28T20:34:36z"));
		System.out.println("formato UTC brazil: "+sdf.format(d));
		System.out.println("formato UTC convertido em GMT: "+sdf1.format(d));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(Calendar.HOUR_OF_DAY, 3);
		d = calendar.getTime();
		System.out.println("GMT + 3 hours: "+sdf1.format(d));
		
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);
		System.out.println("minutes: "+minutes);
		System.out.println("month: "+month);
		
		
		
	}

}
