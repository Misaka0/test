package groovyTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author dengz
 */
public class TestDate {
    public static void main(String[] args)  {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.set(1900,0,-1);
        ca.add(Calendar.DAY_OF_YEAR,2);
        System.out.println(ca.getTime());
        String date = sdf.format(ca.getTime());
        System.out.println(date);

    }

}
