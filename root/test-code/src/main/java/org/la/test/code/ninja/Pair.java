package org.la.test.code.ninja;

public class Pair implements Comparable<Pair> {

    private char character;
    private Integer frequency;

    public Pair(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    @Override
    /** We are sorting Pair using frequency in descending order */
    public int compareTo(Pair pair) {
        return -this.frequency.compareTo(pair.getFrequency());
    }

    public char getCharacter() {
        return character;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "{" +
                "character='" + character + '\'' +
                ", characterCount=" + frequency +
                '}';
    }
}