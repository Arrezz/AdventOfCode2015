package main.java.com.arvidgranroth.adventofcode2015.day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class Day {
    public static final String DEFAULT_DELIMITER = "\n";
    protected final int year;
    protected final int day;
    protected int example = 0;


    public Day(int year, int day) {
        this.year = year;
        this.day = day;
    }

    public String getInput() throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Arvid\\IdeaProjects\\AdventOfCode2015\\src\\main\\java\\com\\arvidgranroth\\adventofcode2015\\day\\day" + day + "\\data\\day" + day + "input.txt");
        Scanner scanner = new Scanner(inputFile);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public abstract Object part1() throws FileNotFoundException;

    public abstract Object part2() throws FileNotFoundException;

    public void printParts() throws FileNotFoundException {
        System.out.println("Part 1: " + part1());
        System.out.println("Part 2: " + part2());
    }

    public void printParts(int example) throws FileNotFoundException {
        this.example = example;
        System.out.println("Part 1: " + part1());
        System.out.println("Part 2: " + part2());
    }


    protected String[] dayStrings() throws FileNotFoundException {
        return dayStrings(DEFAULT_DELIMITER);
    }

    protected String[] dayStrings(String delimiter) throws FileNotFoundException {
        return Arrays.stream(getInput().split(delimiter)).toArray(String[]::new);
    }

    protected Stream<String> dayStream() throws FileNotFoundException {
        return dayStream(DEFAULT_DELIMITER);
    }

    protected Stream<String> dayStream(String delimiter) throws FileNotFoundException {
        return Arrays.stream(getInput().split(delimiter));
    }

    protected IntStream dayIntStream() throws FileNotFoundException {
        return dayIntStream(DEFAULT_DELIMITER);
    }

    protected IntStream dayIntStream(String delimiter) throws FileNotFoundException {
        return Arrays.stream(getInput().split(delimiter)).mapToInt(Integer::parseInt);
    }

    protected long[] dayNumbers() throws FileNotFoundException {
        return dayNumbers(DEFAULT_DELIMITER);
    }

    protected long[] dayNumbers(String delimiter) throws FileNotFoundException {
        return dayNumberStream(delimiter).toArray();
    }

    protected double[] dayDoubles() throws FileNotFoundException {
        return dayDoubles(DEFAULT_DELIMITER);
    }

    protected double[] dayDoubles(String delimiter) throws FileNotFoundException {
        return dayStream(delimiter).mapToDouble(Double::parseDouble).toArray();
    }

    protected LongStream dayNumberStream() throws FileNotFoundException {
        return dayNumberStream(DEFAULT_DELIMITER);
    }

    protected LongStream dayNumberStream(String delimiter) throws FileNotFoundException {
        return dayStream(delimiter).filter(e -> !e.isEmpty()).map(e -> e.replace("\n", "").trim()).mapToLong(Long::parseLong);
    }

    protected char[][] dayGrid() throws FileNotFoundException {
        return dayGrid(DEFAULT_DELIMITER);
    }

    protected char[][] dayGrid(String delimiter) throws FileNotFoundException {
        return dayStream(delimiter).map(String::toCharArray).toArray(char[][]::new);
    }
}