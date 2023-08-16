//write a java program to capitalize the first letter of every word in a file.
import java.io.*;

public class Capital 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader("abcd.txt"));

            // Read each line of the file
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");

                // Capitalize the first letter of each word
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (word.length() > 0) {
                        words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                    }
                }

                // Print the capitalized line
                System.out.println(String.join(" ", words));
            }

            // Close the file
            reader.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
