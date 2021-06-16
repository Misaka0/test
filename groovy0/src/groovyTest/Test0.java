package groovyTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author dengz
 */
public class Test0 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
        long a = Long.parseLong("1623242381742");
        Date date = new Date(a);
        String string = sdf.format(date);
        System.out.println(string);

        Date date1 = sdf.parse("2021-02-02 02:02:02");
        long b = date1.getTime();
        System.out.println(b);

        Calendar ca = new GregorianCalendar();
        System.out.println(ca.get(Calendar.YEAR)); //当前年份
        System.out.println(ca.get(Calendar.MONTH)+1); //6
        System.out.println(ca.get(Calendar.DAY_OF_YEAR)); //161 当年第多少天
        System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //5 一周的第五天，周日算第一天
        System.out.println(ca.get(Calendar.MINUTE)); //当前整点过去分钟数

    }


}
