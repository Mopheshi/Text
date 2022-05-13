package exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ndachimya
 */
public class Text {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        /**
         *I know its bad programming practice to have multiple files to read
         * from while those files can be read as one file with the right computations.
         * I'd be glad if you can share a better approach to handling this amateur
         * programming method of mine ;)
         */
        String kilba = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\kilba.txt";
        String english = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\english.txt";
        String definition = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\definition.txt";

        readList(english);

        Scanner sc = new Scanner(System.in);
        System.out.println("Which word?");
        String word = sc.next();
        System.out.println(readMeaning(word));
    }

    public static ArrayList<String> readList(String fileName) throws IOException {
        ArrayList<String> list = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }

    public static String readMeaning(String english) throws IOException {
        String kil = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\kilba.txt";
        String eng = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\english.txt";
        String def = "C:\\Users\\Ndachimya\\Documents\\NetBeansProjects\\Exercises\\src\\exercises\\definition.txt";

        ArrayList<String> k = (ArrayList<String>) Files.readAllLines(Paths.get(kil));
        ArrayList<String> d = (ArrayList<String>) Files.readAllLines(Paths.get(def));

        int index = returnIndex(eng, english);
        String output = "Meaning of " + english + " is: \n"
                + "In Kilba: " + k.get(index) + "\n"
                + "In English: " + d.get(index);
        return output;
    }

    public static int returnIndex(String list, String word) throws IOException {
        int index = 0;
        ArrayList<String> e = (ArrayList<String>) Files.readAllLines(Paths.get(list));

        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).contains(word)) {
                index = i;
            }
        }
        return index;
    }
}
