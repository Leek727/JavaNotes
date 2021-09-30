import java.io.*;
import java.util.Scanner;

public class OnelineFormatter {
    public static void main(String[] args) {
        String sep = "\\";
        System.out.print("Filename (e.g. leek.java): ");

        // OS detection - linux uses different path sep
        String OS = System.getProperty("os.name");
        if (OS.startsWith("Windows")) {
            sep = "\\";
        } else if (OS.startsWith("Linux")) {
            sep = "/";
        }

        Scanner scan = new Scanner(System.in);
        format_oneline(sep + scan.next());
    }

    public static void format_oneline(String filename) {
        try {
            // constructor of File class having file as argument
            File file = new File(System.getProperty("user.dir") + filename);
            // creates a buffer reader input stream
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("Formatting...");

            // saves file content to a string
            StringBuilder oneline = new StringBuilder();

            char b = ' ';
            int r = 0;
            while ((r = br.read()) != -1) {
                b = (char) r;
                oneline.append(b);

            }

            String output = oneline.toString();

            strip_comments(output);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void strip_comments(String source) {
        boolean commenting = false;
        boolean quotation = false;

        StringBuilder output = new StringBuilder();
        char second;
        char first;
        for (int i = 0; i < source.length(); i++) {
            first = source.charAt(i);
            if (i + 1 < source.length()) {
                second = source.charAt(i + 1);

                if (first == '"' || second == '\'') {
                    if (!commenting){
                        quotation = !quotation;
                    }
                }

                else if (first == '/') {
                    if (second == '/') {
                        commenting = true;
                    }
                }

                else if (first == '\n') {
                    commenting = false;
                    quotation = false;
                }

                if (!commenting || quotation) {
                    output.append(first);
                }
            } else {
                output.append(first);
            }
        }

        String done = output.toString().replaceAll("\\s+"," ");
        System.out.println(done);
    }
}



/* Compile - no args yet
javac OnelineFormatter.java 
java OnelineFormatter
*/