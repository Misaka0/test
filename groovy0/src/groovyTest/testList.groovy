package groovyTest

import java.security.Timestamp
import java.text.SimpleDateFormat

class testList {
    static void main(String[] args) {
        def list = [];
        def map1 = ["absenteeism": "0",
                "attendanceDateStr": "2021-06-01",
                "attendanceRecord": "全勤",
                "departmentName": "电子监察科",
                "employeeId": "100159",
                "employeeName": "张泽华",
                "equipmentId": "10001",
                "fieldwork": "0",
                "later": "0",
                "leavelEarly": "0",
                "permission_level_code": "zgdz01_szwfwhdsjglj02_sxzbmfwzx03",
                "rest": "0",
                "shift": "1",
                "vacation": "0",
                "validWorkHours": "22",
                "workOvertime": "0"];
        def map2 = ["absenteeism": "0",
                "attendanceDateStr": "2021-06-02",
                "attendanceRecord": "全勤",
                "departmentName": "投诉科",
                "employeeId": "100128",
                "employeeName": "张若澜",
                "equipmentId": "10001",
                "fieldwork": "0",
                "later": "0",
                "leavelEarly": "0",
                "permission_level_code": "zgdz01_szwfwhdsjglj02_sxzbmfwzx03",
                "rest": "0",
                "shift": "1",
                "vacation": "0",
                "validWorkHours": "22",
                "workOvertime": "0"];
        list.addAll(map1,map2);
        def a = "2021-06-01"
        def b = "年休假";
        println b.contains("休");


//        for(temp in list){
//            println temp.attendanceDateStr.toString() == a.toString();
//        }


    }
}
