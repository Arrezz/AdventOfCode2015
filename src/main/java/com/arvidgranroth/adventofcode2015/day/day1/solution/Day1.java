package main.java.com.arvidgranroth.adventofcode2015.day.day1.solution;

import main.java.com.arvidgranroth.adventofcode2015.day.Day;
import main.java.com.arvidgranroth.adventofcode2015.day.day2.solution.Day2;

import java.io.FileNotFoundException;

public class Day1 extends Day {

    public Day1() {
        super(2021, 1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Day1().printParts();
    }

    public Object part1() throws FileNotFoundException {
        String input = getInput();
        int result = 0;

        for(char c: input.toCharArray()) {
            if (c == '(') {
                result++;
            }
            else {
                result--;
            }
        }
        return result;
    }

    public Object part2() throws FileNotFoundException {
        String input = getInput();
        int counter = 0;

        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                counter++;
            }
            else {
                counter--;
            }
            if (counter == -1) {
                // one-based indexing in 2022? we really do be living in a society
                return i+1;
            }
        }
        return "None found";
    }
}
