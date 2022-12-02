/**
 * @author Dylan Worseling (500911345)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Day2 {
        public static void main(String[] args) {

            String data;
            int arrGrootte = 0;
            int pointsPart1 = 0;
            int pointsPart2 = 0;

            try {
                // Text file reader
                File myObj = new File("input/day2.txt");
                Scanner myReader = new Scanner(myObj);

                // Find needed array size
                while (myReader.hasNextLine()) {
                    myReader.nextLine();
                    arrGrootte++;
                }

                System.out.println("\nArray size: " + arrGrootte);

                String[] rps = new String[arrGrootte];

                myReader.close();
                myReader = new Scanner(myObj);

                // Push data into array per line
                for (int i = 0; i < arrGrootte; i++) {
                    data = myReader.nextLine();
                    rps[i] = data;
                }

                for (int i = 0; i < rps.length; i++) {
                    String first = rps[i].split(" ", 0)[0];
                    String second = rps[i].split(" ", 0)[1];

                    // Rock VS Rock
                    if (first.equals("A") && second.equals("X")) {
                        pointsPart1 += 4;
                        pointsPart2 += 3;
                    }
                    // Paper VS Rock
                    if (first.equals("A") && second.equals("Y")) {
                        pointsPart1 += 8;
                        pointsPart2 += 4;
                    }
                    // Scissors VS Rock
                    if (first.equals("A") && second.equals("Z")) {
                        pointsPart1 += 3;
                        pointsPart2 += 8;
                    }
                    // Rock VS Paper
                    if (first.equals("B") && second.equals("X")) {
                        pointsPart1 += 1;
                        pointsPart2 += 1;
                    }
                    // Paper VS Paper
                    if (first.equals("B") && second.equals("Y")) {
                        pointsPart1 += 5;
                        pointsPart2 += 5;
                    }
                    // Scissors VS Paper
                    if (first.equals("B") && second.equals("Z")) {
                        pointsPart1 += 9;
                        pointsPart2 += 9;
                    }
                    // Rock VS Scissors
                    if (first.equals("C") && second.equals("X")) {
                        pointsPart1 += 7;
                        pointsPart2 += 2;
                    }
                    // Paper VS Scissors
                    if (first.equals("C") && second.equals("Y")) {
                        pointsPart1 += 2;
                        pointsPart2 += 6;
                    }
                    // Scissors VS Scissors
                    if (first.equals("C") && second.equals("Z")) {
                        pointsPart1 += 6;
                        pointsPart2 += 7;
                    }
                }

                System.out.println("\nTotal points, Part 1: " + pointsPart1);
                System.out.println("\nTotal points, Part 2: " + pointsPart2);

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
