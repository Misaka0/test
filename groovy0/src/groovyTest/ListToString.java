package groovyTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Collections.addAll(list,"a1","b1","c1","d1","a1","c1");
        System.out.println(list);
        List list1 = new ArrayList(new HashSet(list));
        System.out.println("list1:"+list1);
        String a = list.stream().collect(Collectors.joining(", ")).toString();
        System.out.println(a);
    }
}
//('" + invUserIdList.join("','") + "') ";