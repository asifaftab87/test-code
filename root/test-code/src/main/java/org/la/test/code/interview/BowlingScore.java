package org.la.test.code.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BowlingScore {

    private List<Integer> currentFrame;
    private List<List<Integer>> frames;

    boolean is10thFrame() { return frames.size() == 9; }
    boolean isGameOver() { return frames.size() == 10; }

    void roll(int pins) {
        if (this.isGameOver()) {
            throw new Error("Cannot roll after game is over");
        }
        if (pins < 0) {
            throw new Error("Negative roll is invalid");
        }
        if (pins > 10) {
            throw new Error("Pin count exceeds pins on the lane");
        }
        switch (this.currentFrame.size()) {
            case 0:
                this.roll1(pins);
                break;
            case 1:
                this.roll2(pins);
                break;
            case 2:
                this.roll3(pins);
                break;
            default: throw new Error("Too many rolls.");
        }
    }

    void roll1(int first) {
        if (!this.is10thFrame() && first == 10) {
            this.frames.add(Arrays.asList(10));
        } else {
            this.currentFrame.add(first);
        }
    }

    void roll2(int second) {
        int first = this.currentFrame.get(0);
        if (first < 10 && first + second > 10) {
            throw new Error("Pin count exceeds pins on the lane");
        }
        if (!this.is10thFrame() || first + second < 10) {
            if(currentFrame.size()>0) {
                int first1 = currentFrame.remove(0);
                frames.add(Arrays.asList(first1, second));
            } else {
                frames.add(Arrays.asList(second));
            }
        } else {
            this.currentFrame.add(second);
        }
    }

    void roll3(int third) {
        Integer first = null, second = null;
        if (currentFrame.size()>0)
            first = currentFrame.get(0);
        if (currentFrame.size()>1)
            second = currentFrame.get(0);
        if (first!=null && first==10 && second!=null && second < 10 && second + third > 10) {
            throw new Error("Pin count exceeds pins on the lane");
        }
        this.frames.add(Arrays.asList(first, second, third));
    }

    int score() {
        if (!this.isGameOver()) {
            throw new Error("Score cannot be taken until the end of the game");
        }
        List<Integer> rolls = frames.stream().flatMap(List::stream).collect(Collectors.toList());
        int score = 0;
        for (int frame = 1; rolls.size() > 0; frame += 1) {
            if (frame == 10) {
                score += rolls.stream().reduce(0, (sum, roll) -> sum + roll);
            } else if (rolls.get(0) == 10) {
                int rem = rolls.remove(0);
                score += rem + rolls.get(0) + rolls.get(1);
            } else if (rolls.get(0) + rolls.get(1) == 10) {
                int rem1 = rolls.remove(0);
                int rem2 = rolls.remove(0);
                score += rem1 + rem2 + rolls.get(0);
            } else {
                score += rolls.remove(0) + rolls.remove(0);
            }
        }
        return score;
    }


}
