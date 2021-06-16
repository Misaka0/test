import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubStringTest {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1,"A1_B2_C3_D4","A1_B2","A1_B2_C4");
        System.out.println(arr1);
        System.out.println(arr1.contains("C4"));

        String string = "01A_02B_03C_04D";
        String[] str1 = string.split("_");
        System.out.println(Arrays.toString(str1));
        String x = "_";
        String str2 = "";
        for(int i = 0;i< str1.length;i++){
            str2 += str1[i]+x;
            System.out.println(str2.substring(0,str2.length()-1));
        }

    }
}
