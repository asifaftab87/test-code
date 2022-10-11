package org.la.test.code.interview;

public class BowlingScore2 {

    static void bowling(){

        int score = 0;
        boolean spare = false;
        boolean strike = false;
        for (int round = 1; round <= 10; round++) {
            double first = Math.floor(Math.random() * 11);
            double second = Math.floor(Math.random() * (11 - first));
            if (round == 10 && strike) {
                double third = Math.floor(Math.random() * 11);
                score += third;
            }
            if (first == 10) {
                //strike
                if (spare) {
                    spare = false;
                    score += 10;
                }
                score += 10;
                strike = true;
                System.out.println("X |"+ score);
            } else if (first + second == 10) {
                //spare
                if (strike) {
                    score += 10;
                } else if (spare) {
                    score += first;
                }
                spare = true;
                strike = false;
                score += 10;
                System.out.println(first + "/" + "|" + score);
            } else {
                if (strike) {
                    score = score + (int)first + (int)second;
                } else if (spare) {
                    score += first;
                }
                spare = false;
                strike = false;
                score = score + (int)first + (int)second;
                System.out.println(first+" "+ second + "|" + score);
            }
        }
        System.out.println("Score" + score);
    }

    public static void main(String[] args) {
        bowling();
    }
}
