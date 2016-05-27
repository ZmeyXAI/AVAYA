import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws Exception {
    /*    try {
            Class.forName("com.informix.jdbc.IfxDriver");
            (Connection c = DriverManager.getConnection("jdbc:informix-sqli://91.151.128.70:50001/cms:INFORMIXSERVER=cms_cms", "cms", "p22qqkmdHy")) {
            }
            String s="";

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }*/
        long n = 1458333500;
        Date date = new Date(n * 1000L);
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        calendar.setTime(date);
        System.out.println(date);
    }


}
