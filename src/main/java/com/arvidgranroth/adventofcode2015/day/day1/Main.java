package main.java.com.arvidgranroth.adventofcode2015.day.day1;

import main.java.com.arvidgranroth.adventofcode2015.day.day1.solution.Day1;
import main.java.com.arvidgranroth.adventofcode2015.day.day2.solution.Day2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Day1 solutionDay1 = new Day1();
        solutionDay1.part1();
        solutionDay1.part2();
        Day2 solutionDay2 = new Day2();
        solutionDay2.part1();
        solutionDay2.part2();
    }
}
