package main.java.com.arvidgranroth.adventofcode2015.day.day1.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{

    public Day1() {
    }

    public void part1() throws FileNotFoundException {
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

        System.out.println(result);

    }

    public void part2() throws FileNotFoundException {
        String input = getInput();
        int result = 0;

        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                result++;
            }
            else {
                result--;
            }
            if (result == -1) {
                System.out.println(i+1); // one-based indexing in 2022? we really do be living in a society
            }
        }
    }

    private String getInput() throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Arvid\\IdeaProjects\\AdventOfCode2015\\src\\main\\java\\com\\arvidgranroth\\adventofcode2015\\day\\day1\\data\\day1input.txt");
        Scanner scanner = new Scanner(inputFile);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next());
        }
        return stringBuilder.toString();
    }
}
