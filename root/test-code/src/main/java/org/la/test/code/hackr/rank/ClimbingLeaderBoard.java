package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderBoard {

    public static Map<Integer, Integer> assignRank(List<Integer> dupDistinctRanked, int playerVal){
        dupDistinctRanked.add(playerVal);
        Map<Integer, Integer> map = assignedRank(dupDistinctRanked);
        //System.out.println("map: "+map);
        return map;
    }

    public static Map<Integer, Integer> assignedRank(List<Integer> distinctRankedList){
        int i = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int e : distinctRankedList){
            map.put(e, i++);
        }
        return map;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> playerList) {
        List<Integer> result = new ArrayList<>();
        List<Integer> dupRanked = new ArrayList<>(ranked);
        List<Integer> distinctRankedList = dupRanked.stream().distinct().collect(Collectors.toList());

        Map<Integer, Integer> map = null;
        for(int player : playerList) {
            if(!distinctRankedList.contains(player)){
                distinctRankedList.add(player);
                //distinctRankedList = distinctRankedList.stream().distinct().collect(Collectors.toList());
                Collections.sort(distinctRankedList, Collections.reverseOrder());
            }
            map = assignedRank(distinctRankedList);
            Integer value = map.get(player);
            if(value!=null){
                result.add(value);
            }
        }
        System.out.println("map: "+map);

        return result;
    }


    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));
        //ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        //player = new ArrayList<>(Arrays.asList(50, 65, 77, 90, 102));
        //ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        //player = new ArrayList<>(Arrays.asList(40, 50, 65, 77, 90, 102, 103));
        List<Integer> integers = climbingLeaderboard(ranked, player);
        System.out.println("result: ----------------------: "+integers);
    }



    public static List<Integer> climbingLeaderboard3(List<Integer> ranked, List<Integer> player) {

        List<Integer> result = new ArrayList<>();
        List<Integer> merge = new ArrayList<>();
        merge.addAll(ranked);
        merge.addAll(player);
        //System.out.println(merge);
        List<Integer> distinctRankedList = merge.stream().distinct().collect(Collectors.toList());
        //System.out.println(distinctRankedList);
        Collections.sort(distinctRankedList);
        //System.out.println(distinctRankedList);
        //Collections.reverse(distinctRankedList);
        //System.out.println(distinctRankedList);
        final int[] i = {distinctRankedList.size()};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        distinctRankedList.forEach( e -> {
            map.put(e, i[0]);
            i[0] = i[0] - 1;
        });
       // System.out.println(map);
        //System.out.println("player: "+player);
        //System.out.println("distinctRankedList: "+distinctRankedList);
        //result = distinctRankedList.stream().filter(m -> player.stream().anyMatch(p -> m==p)).collect(Collectors.toList());

        // filter one list from other list
        List<Map.Entry<Integer, Integer>> mapList = map.entrySet().stream().filter(m -> player.stream().anyMatch(p -> {
            return m.getKey()==p;
        })).collect(Collectors.toList());
        for(Map.Entry<Integer, Integer> mt : mapList){
            //System.out.print(mt.getValue()+" : ");
            result.add(mt.getValue());
        }
        //System.out.println("collect: "+mapList);

        return result;
    }

    public static List<Integer> climbingLeaderboard2(List<Integer> ranked, List<Integer> player) {

        List<Integer> result = new ArrayList<>();

        List<Integer> distinctRankedList = ranked.stream().distinct().collect(Collectors.toList());
        Collections.reverse(distinctRankedList);
        //System.out.println(distinctRankedList);

        Map<Integer, Integer> rankMap = new LinkedHashMap<>();
        final int[] i = {distinctRankedList.size()+1};
        distinctRankedList.stream().forEach(e -> {
            i[0] = i[0] - 1;
            rankMap.put(e, i[0]);
        });
        System.out.println("rankMap: "+rankMap);
        System.out.println("player: "+player);
        int rmi = 0;
        int pi = 0;
        for( ; pi<player.size() ; pi++){
            if(rmi<rankMap.size()) {
                int rkey = (int) rankMap.keySet().toArray()[rmi];
                if (player.get(pi) < rkey){
                    reverse(pi, player, rkey, rankMap.get(rkey), result);
//                    result.add(rankMap.get(rkey)+1);

                }
                else if(player.get(pi)==rkey){
                    result.add(rankMap.get(rkey));
                }
                else {
                    pi--;
                }
                rmi++;
            }
            else{
                break;
            }
        }
        if(pi<=player.size()){
            result.add(1);
        }
        System.out.println("pi: "+pi);
        System.out.println("finish the end");
        return result;
    }

    static int forward(int playerRank, int rmi, List<Integer> result, Map<Integer, Integer> rankMap){
        int rankKey = (int)rankMap.keySet().toArray()[rmi];
        int rankValue = rankMap.get(rankKey);
        int rank = 1;
        if(playerRank>rankKey){
            rank = rank + forward(playerRank, rmi+1, result, rankMap);
            result.add(rank);
        }
        return rank;
    }

    static int reverse(int pi, List<Integer> player, int rankKey, int rankValue, List<Integer> result){
        if(player.get(pi)<rankKey){
            result.add(reverse(pi+1, player, rankKey, rankValue+1, result));
        }
        return rankValue;
    }

    static int fun(int i){
        return ++i;
    }
}
