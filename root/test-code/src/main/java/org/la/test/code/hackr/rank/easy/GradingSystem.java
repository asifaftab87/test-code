package org.la.test.code.hackr.rank.easy;

import org.la.test.code.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
url: https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of .
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 40)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
 */
public class GradingSystem {
    public static void main(String[] args) {
//        List<Integer> list = gradingStudents(Arrays.asList(1,29,40,50, 38));
        List<Integer> list = gradingStudents(Arrays.asList(73, 67, 38, 33));
        Util.print(list);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        for(int grade : grades) {
            if(grade>=38) {
                if((grade+2)%5==0) {
                    list.add(grade+2);
                } else if((grade+1)%5==0) {
                    list.add(grade+1);
                } else {
                    list.add(grade);
                }
            } else {
                list.add(grade);
            }
        }
        return list;
    }
}
