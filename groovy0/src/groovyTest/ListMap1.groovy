package groovyTest

class ListMap1 {
    static void main(String[] args) {
        def listMap = [[:]];
        listMap = [[
                           "user_name" : "陈小虎",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "汪佳",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "孙贺文",
                           "begin_time": 1620995400000,
                           "end_time"  : 1621017000000
                   ],
                   [
                           "user_name" : "陈小虎",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "汪佳",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "孙贺文",
                           "begin_time": 1620995400000,
                           "end_time"  : 1621017000000
                   ],
                   [
                           "user_name" : "陈小虎",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "汪佳",
                           "begin_time": 1620909000000,
                           "end_time"  : 1620930600000
                   ],
                   [
                           "user_name" : "孙贺文",
                           "begin_time": 1620995400000,
                           "end_time"  : 1621017000000
                   ],
                   [
                           "user_name" : "袁顺1",
                           "begin_time": 1621254600000,
                           "end_time"  : 1621276200000
                   ],
                   [
                           "user_name" : "孙贺文",
                           "begin_time": 1621341000000,
                           "end_time"  : 1621362600000
                   ],
                   [
                           "user_name" : "袁顺1",
                           "begin_time": 1621427400000,
                           "end_time"  : 1621449000000
                   ],
                   [
                           "user_name" : "孙贺文",
                           "begin_time": 1621513800000,
                           "end_time"  : 1621535400000
                   ]
        ];

        def listResult = [];
        listMap.each {
            def list = [];
            it.each {
                s->list.add(s.getValue());
            }
            listResult.add(list);
        }
        println listResult


    }
}
