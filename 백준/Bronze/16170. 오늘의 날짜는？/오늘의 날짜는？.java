import java.time.*;

public class Main{
    public static void main(String[] args){
        ZonedDateTime zd = ZonedDateTime.now();
        zd.minusHours(9);
        System.out.println(zd.getYear());
        System.out.println(zd.getMonthValue());
        System.out.println(zd.getDayOfMonth());
    }
}