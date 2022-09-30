package org.la.test.code.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {

    int start, end, current;
    public Test() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return start == test.start &&
                end == test.end &&
                current == test.current;
    }

    @Override
    public int hashCode() {

        return Objects.hash(start, end, current);
    }


    public static void main(String[] args) {
        int a[] = {2,7,3,11,5};
        int k = 22;
        int l = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<l ; i++) {
            map.put(a[i], a[i]);
            Integer res = map.get(k - a[i]);
        }
        for(int i=0 ; i<l ; i++) {
            Integer res = map.get(k - a[i]);
            if(res!=null)
                System.out.println(a[i]+"  :  "+res);
        }
        for(int i=0 ; i<l ; i++) {
            for(int j=i+1 ; j<l ; j++) {
                if(i!=j && (a[i]+a[j]==k)) {
//                    System.out.println(a[i]+" : "+a[j]);
                }
            }
        }
    }
}

//
//        a[i] + a[j] = k
//                i!=j

/*
empid, name, mngid, joiningdate = jd
select * from table where jd > (select * from table where mngid=somegivenvalue)
select * from table t1, table t2 t1.mngid=t2.empid and t1.jd<t2.jd;
1.
    tree
    dynamic programming
    linklist
    recursion
2.
    sql
 */
