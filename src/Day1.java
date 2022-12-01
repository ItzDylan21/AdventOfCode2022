/**
 * @author Dylan Worseling (500911345)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        String data = null;
        int elfTotaal = 0;
        int arrGrootte = 0;

        try {
            File myObj = new File("input/day1.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                if(data == "") {
                    myReader.nextLine();
                    arrGrootte++;
                }
            }

            myReader.close();
            myReader = new Scanner(myObj);

            System.out.println("\nArray grootte: " + arrGrootte);
            int elf[] = new int[arrGrootte];

            for (int i = 0; i < arrGrootte;) {
                data = myReader.nextLine();
                if(data != "") {
                    elf[i] += Integer.valueOf(data);
                }
                else {
                    i++;
                }
            }

            Arrays.sort(elf);
            System.out.println("\nElf met meeste calorieën: " + elf[arrGrootte - 1]);

            for (int i = 1; i < 4; i++) {
                elfTotaal += elf[arrGrootte - i];
            }

            System.out.println("\nTop 3 totale calorieën: " + elfTotaal);


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
