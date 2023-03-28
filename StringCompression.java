/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MOPHE
 */
public class StringCompression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myText = sc.nextLine().trim().toLowerCase();
        int count = 0;

        Map<Character, Integer> count_map = new HashMap<>();
        for (int i = 0; i < myText.length(); i++) {
            char c = myText.charAt(i);
            if (count_map.containsKey(c)) {
                count_map.put(c, count_map.get(c) + 1);
                count++;
            } else {
                count_map.put(c, 1);
            }
        }
        System.out.println(count);

//        System.out.println(countRepeatedCharacters("uditha"));
    }

}
