package org.la.test.code.karumanchi.back.tracking;

import java.util.Arrays;
import java.util.List;
/*
    This is not working as I wish
 */
public class StringDrawnKTimes2 {

    List<String> list = Arrays.asList("a", "b", "c");
    public static void main(String[] args) {
        StringDrawnKTimes2 t = new StringDrawnKTimes2();
        t.takenKTimes(t.list.size(), 2);
    }

    void takenKTimes(int s, int k){
        if(s<1){
            list.stream().forEach(e -> System.out.print(" "+e));
            System.out.println("");
        }
        else{
            for(int j=0 ; j<k ; j++){
                String t = list.get(s-1);
                list.set(s-1, list.get(j));
                list.set(j, t);
                takenKTimes(s-1, k);
            }
        }
    }

}
