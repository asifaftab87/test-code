package org.la.test.code.live.intrv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoffeMachine {
    public static void main(String[] args) {
        CoffeMachine cm = new CoffeMachine();
        System.out.println(cm.completeOrder("C:2:0"));
    }

    private String completeOrder(String s) {
        int sugarSpoon = -1;
        String stick = "";

        String[] arr = s.split(":");
        if(arr.length==3){
            if(arr[1].equals("")) {
                sugarSpoon = 0;
            }
            else {
                sugarSpoon = Integer.valueOf(arr[1]);
            }
            stick = arr[2];
        }
        else if(arr.length==2){
            sugarSpoon = Integer.valueOf(arr[1]);
            stick = "-1";
        }
        else if(arr.length==1){
            sugarSpoon = 0;
            stick = "-1";
        }
        return makeDrink(arr[0]) + " with "
                + addSugar(sugarSpoon) + " and " +  isStick(stick);
    }

    private String isStick(String str) {
        if(str.equals("0"))
            return "a stick";
        return "therefore no stick";
    }
    private String addSugar(int num){
        if(num==0){
            return "no sugar -";
        }
        return num + " sugars";
    }

    private String makeDrink(String selection) {
        switch (selection) {
            case "T":
                return "Drink maker makes 1 tea";
            case "H":
                return "Drink maker makes 1 chocolate";
            case "C":
                return "Drink maker makes 1 coffee";
        }
        return null;
    }
}
