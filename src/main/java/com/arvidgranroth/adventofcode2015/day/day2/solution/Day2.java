package main.java.com.arvidgranroth.adventofcode2015.day.day2.solution;

import main.java.com.arvidgranroth.adventofcode2015.day.Day;

import javax.sound.midi.SysexMessage;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day2 extends Day {


    public Day2() {
        super(2021, 2);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Day2().printParts();
    }

    @Override
    public Object part1() throws FileNotFoundException {
        int result = 0;
        for(String line: dayStrings()) {
            String l = "";
            String w = "";
            String h = "";
            int numOfX = 0;
            for(char character: line.toCharArray()) {
                if(character == 'x') {
                    numOfX++;
                } else if (numOfX == 0) {
                    l += character;
                } else if (numOfX == 1) {
                    w += character;
                } else if (numOfX == 2) {
                    h += character;
                }
            }
            Integer lInt = Integer.parseInt(l);
            Integer wInt = Integer.parseInt(w);
            Integer hInt = Integer.parseInt(h);

            result += 2*lInt*wInt;
            result += 2*wInt*hInt;
            result += 2*hInt*lInt;

            result += Math.min(wInt, Math.min(hInt,lInt));
        }
        return result;
    }

    @Override
    public Object part2() throws FileNotFoundException {
        int result = 0;
        for(String line: dayStrings()) {
            String l = "";
            String w = "";
            String h = "";
            int numOfX = 0;
            for(char character: line.toCharArray()) {
                if(character == 'x') {
                    numOfX++;
                } else if (numOfX == 0) {
                    l += character;
                } else if (numOfX == 1) {
                    w += character;
                } else if (numOfX == 2) {
                    h += character;
                }
            }
            Integer lInt = Integer.parseInt(l);
            Integer wInt = Integer.parseInt(w);
            Integer hInt = Integer.parseInt(h);

            result += lInt*wInt*hInt;

            result += 2 * Math.min(wInt, Math.min(hInt,lInt)) + 2 * Math.max(Math.min(wInt,lInt), Math.min(Math.max(wInt,lInt),hInt));
        }
        return result;
    }
}
