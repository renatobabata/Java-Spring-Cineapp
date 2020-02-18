package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Util {

		public static List<String> getNextDays(int count){
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date start = new Date();
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, count);
			Date endDate = cal.getTime();
			
			GregorianCalendar gcal = new GregorianCalendar();
			gcal.setTime(start);
			List<String> nextDays = new ArrayList<String>();
			while(!gcal.getTime().after(endDate)) {
				Date d = gcal.getTime();
				gcal.add(Calendar.DATE, 1);
				nextDays.add(sdf.format(d));
				
			}
			return nextDays;
		}
}
