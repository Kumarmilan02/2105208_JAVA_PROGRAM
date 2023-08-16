//write a java program to copy the content of a given file to another user entered  file using character stream.

import java.io.*;

public class CopyFile 
{
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try 
        {
            // User inputs
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter source file name: ");
            String sourceFileName = inputReader.readLine();
            System.out.print("Enter destination file name: ");
            String destinationFileName = inputReader.readLine();

            // Open the source file for reading
            reader = new BufferedReader(new FileReader(sourceFileName));

            // Open the destination file for writing
            writer = new BufferedWriter(new FileWriter(destinationFileName));

            // Read each line from the source file and write to the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (reader != null) 
                {
                    reader.close();
                }
                if (writer != null) 
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
