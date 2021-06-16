import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author dell
 * @Date 2021/4/25 17:34
 * @Version 1.0
 */
public class ListMap {
    public static void main(String[] args) {
        List<Map<String, String>> listes = new ArrayList<>();

        Map<String, String> map2 = new HashMap<>();
        map2.put("CHEAPISH", "鄂-A12345");
        map2.put("DAYS", "2");

        HashMap<String, String> map = new HashMap<>();
        map.put("CHEAPISH","无车牌号码");
        map.put("DAYS", "5");

        Map<String, String> map1 = new HashMap<>();
        map1.put("CHEAPISH", "无车牌号码");
        map1.put("DAYS", "4");

        Map<String, String> map3 = new HashMap<>();
        map3.put("CHEAPISH", "鄂A-43242");
        map3.put("DAYS", "2");

        Map<String, String> map4 = new HashMap<>();
        map4.put("CHEAPISH", "鄂A-00112");
        map4.put("DAYS", "1");

        Map<String, String> map5 = new HashMap<>();
        map5.put("CHEAPISH", "鄂-A12345");
        map5.put("DAYS", "3");

        Collections.addAll(listes,map,map1,map2,map3,map4,map5);
        System.out.println(listes);

        listes.stream().map(s ->{
            return JSON.parseObject(JSON.toJSONString(s), Card.class);
        }).distinct().collect(Collectors.toList()).forEach(s-> System.out.println("s = " + s));

        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>(new HashSet<Map<String, String>>(listes));

        System.out.println("mapList = " + mapList);


//        for(int i = 0;i<listes.size();i++){
//            int num = Integer.parseInt(listes.get(i).get("DAYS"));
//
//            for(int j=i+1;j<listes.size();j++){
//                if(listes.get(i).get("CHEAPISH").equals(listes.get(j).get("CHEAPISH"))){
//                    num += Integer.parseInt(listes.get(j).get("DAYS"));
//                    listes.remove(j);
//                    j--;
//                }
//            }
//            listes.get(i).put("DAYS",String.valueOf(num));
//        }
//        System.out.println(listes);
    }




    public List<Map<String, String>> aa(List<Map<String, String>> bb){
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map2 = new HashMap<>();
        map2.put("CHEAPISH", "鄂-A12345");
        map2.put("DAYS", "2");

        HashMap<String, String> map = new HashMap<>();
        map.put("CHEAPISH","无车牌号码");
        map.put("DAYS", "5");

        Map<String, String> map1 = new HashMap<>();
        map1.put("CHEAPISH", "无车牌号码");
        map1.put("DAYS", "5");

        Map<String, String> map3 = new HashMap<>();
        map3.put("CHEAPISH", "鄂A-43242");
        map3.put("DAYS", "2");

        Map<String, String> map4 = new HashMap<>();
        map4.put("CHEAPISH", "鄂A-00112");
        map4.put("DAYS", "1");

        Map<String, String> map5 = new HashMap<>();
        map5.put("CHEAPISH", "鄂-A12345");
        map5.put("DAYS", "3");

        Collections.addAll(list,map,map1,map2,map3,map4,map5);

        /*List<Map<String, Object>> result  = Stream.of(map,map1,map2,map3,map4,map5)
                .flatMap(Collection::stream).distinct().collect(Collectors.toList());*/
        return null;
    }
}
