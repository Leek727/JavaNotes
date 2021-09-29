import java.io.*;
import java.util.Scanner;

public class OnelineFormatter {
    public static void main(String[] args) {
        System.out.print("Filename (e.g. leeks.java): ");
        Scanner scan = new Scanner(System.in);
        format_oneline(scan.next());
    }

    public static void format_oneline(String filename) {
        try {
            // constructor of File class having file as argument
            File file = new File(System.getProperty("user.dir") + "\\" + filename);
            // creates a buffer reader input stream
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("Formatting...");

            StringBuilder oneline = new StringBuilder();

            char b = ' ';
            int r = 0;
            while ((r = br.read()) != -1) {
                b = (char) r;
                oneline.append(b);

            }

            String output = oneline.toString().replaceAll("\\s+"," ");
            System.out.println(output);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/* Compile - no args yet
javac OnelineFormatter.java 
java OnelineFormatter
*/