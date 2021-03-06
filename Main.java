
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;  
public class Main
{
public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

 public static void main (String[] args) throws java.lang.Exception
 {

   // Date dt = new Date();
   // System.out.println(dt);

        // List<Date> dates = getDates("2020-01-03",dateFormat.format(new Date()));
        
        
        //IF you don't want to reverse then remove Collections.reverse(dates);
        // Collections.reverse(dates);
      //  System.out.println(dates.size());
       List<Date> dates = getDates("2020-01-05","2020-01-10");
    for(Date date:dates)
    {
        System.out.println(date);
    }
}
 public static List<Date> getDates(String fromDate, String toDate)
 {
    ArrayList<Date> dates = new ArrayList<Date>();

    try {

        Calendar fromCal = Calendar.getInstance();
        fromCal.setTime(dateFormat .parse(fromDate));

        Calendar toCal = Calendar.getInstance();
        toCal.setTime(dateFormat .parse(toDate));

        while(!fromCal.after(toCal))
        {
            dates.add(fromCal.getTime());
            fromCal.add(Calendar.DATE, 1);
        }


    } catch (Exception e) {
        System.out.println(e);
    }
    return dates;
 }
}
