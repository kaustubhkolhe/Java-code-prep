/*Question: Provide 98 unique integers all in range of 1-100. It means 2 integers from
            range 1-100 are missing. Find those 2 missing integers. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> list = getRandomNonRepeatingIntegers(98, 1, 100);


        Collections.sort(list);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(" " + list.get(j));
        }


        int counter = 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != counter) {
                System.out.println("\nMissing number " + counter);
                counter++;
            }
            counter++;
        }

    }




    //Get selected size number without duplicate
    public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (numbers.size() < size) {
            //Get Random numbers between range
            int randomNumber = random.nextInt((max - min) + 1) + min;
            //Check for duplicate values
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        return numbers;
    }

}








