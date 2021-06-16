import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author dell
 * @Date 2021/4/24 21:48
 * @Version 1.1
 */
public class DateTest {
    public static void main(String[] args) throws Exception {
        String a = "123123131jj1";
        try {
            if(Long.valueOf(a)/1000>100000000L && Long.valueOf(a)/1000<1000000000000L){
                System.out.println(Long.valueOf(a));
            }
        } catch (Exception e) {
            throw new Exception("参数有误");
        }
    }

}
