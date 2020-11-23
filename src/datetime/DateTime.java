package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {
     
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("dd//MM/YYYY");
        String formatedDate=dateFormat.format(date);
        
        System.out.println(formatedDate);
        
        LocalTime time=LocalTime.now();
        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatedTime=time.format(timeFormat);
        
        System.out.println(formatedTime);
        
    }
    
}
