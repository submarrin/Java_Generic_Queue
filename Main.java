import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File input = new File("f.txt");
            FileReader fileReader = new FileReader(input);
            BufferedReader reader = new BufferedReader(fileReader);

            FileWriter writer = new FileWriter("g.txt");

            String line = null;

            while ((line = reader.readLine()) != null) {
                StringToParts newStr = new StringToParts(line);
                String letters = newStr.getLetters();
                String nums = newStr.getNums();
                int count = nums.length();

                writer.write(letters + " " + nums + " " + count + "\r\n" );
            }
            writer.close();
            reader.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
