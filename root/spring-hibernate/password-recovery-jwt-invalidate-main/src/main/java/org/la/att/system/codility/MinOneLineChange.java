package org.la.att.system.codility;
import java.util.*;

public class MinOneLineChange {

        static int minIncrementForUnique(int[] A) {

            Map<Integer, Integer> map = new TreeMap<>();
            Set<Integer> set = new HashSet<>();

            for (int x : A) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                    set.add(x);
                }
            }
            int maxRepeat = 0;
            int result = 0;
            for (Map.Entry<Integer, Integer> data : map.entrySet()) {
                int key = data.getKey();
                int repeat = data.getValue();
                if (repeat <= 1) {
                    continue;
                }
                int duplicates = repeat - 1;
                int present = Math.max(key + 1, maxRepeat);
                while (duplicates > 0) {
                    if (!set.contains(present)) {
                        result += present - key;
                        set.add(present);
                        duplicates--;
                        maxRepeat = present;
                    }
                    present++;
                }
            }
            return result;
        }

        // Driver code

        public static void main(String[] args)
        {
            int[] A = { 3, 2, 1, 2, 1, 2, 6, 7 };
            System.out.print(minIncrementForUnique(A));
        }
    }

