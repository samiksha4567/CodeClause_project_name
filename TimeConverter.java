import java.util.*;
import java.text.*;

public class TimeConverter
{
    public static void main(String args[])
    {
        String[] ids=TimeZone.getAvailableIDs();
        String format="dd-M-yyyy hh:mm:ss a";
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);
        Date dt=new Date();
        Calendar cal=new GregorianCalendar();
        TimeZone jnbTZ=TimeZone.getTimeZone("Africa/Johannesburg");
        String defaultTZ=TimeZone.getDefault().getID();
        System.out.println(defaultTZ);
        cal.setTime(dt);
        System.out.println("Date:"+dateFormat.format(cal.getTime()));
        System.out.println("TimeZone:"+cal.getTimeZone().getID());
        System.out.println("TimeZone Name:"+cal.getTimeZone().getDisplayName());
        SimpleDateFormat jnbFormat=new SimpleDateFormat(format);
        jnbFormat.setTimeZone(jnbTZ);
        cal.setTimeZone(jnbTZ);
        System.out.println("After Conversion");
        System.out.println("Date:"+jnbFormat.format(cal.getTime()));
        System.out.println("TimeZone:"+cal.getTimeZone().getID());
        System.out.println("TimeZone Name:"+cal.getTimeZone().getDisplayName());
    }
}