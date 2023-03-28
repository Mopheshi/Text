/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.io.UnsupportedEncodingException;
import java.util.zip.Deflater;

/**
 *
 * @author MOPHE
 * @reference https://www.delftstack.com/howto/java/java-string-compression/
 */
public class CompressString {
    public static void main(String args[]) throws UnsupportedEncodingException {
        // Using the deflater object
        Deflater new_deflater = new Deflater();
        String Original_string = "This is Delftstack ", repeated_string = "";
        // Generate a repeated string
        for (int i = 0; i < 5; i++){
            repeated_string += Original_string;
        }
        // Convert the repeated string into bytes to set the input for the deflator
        new_deflater.setInput(repeated_string.getBytes("UTF-8"));
        new_deflater.finish();
        // Generating the output in bytes
        byte compressed_string[] = new byte[1024];
        // Storing the compressed string data in compressed_string. the size for compressed string will be 13
        int compressed_size = new_deflater.deflate(compressed_string, 5, 15, Deflater.FULL_FLUSH);
        // The compressed String
        System.out.println("The Compressed String Output: " + new String(compressed_string) + "\n Size: " + compressed_size);
        //The Original String
        System.out.println("The Original Repeated String: " + repeated_string + "\n Size: " + repeated_string.length());
        new_deflater.end();
    }
}
