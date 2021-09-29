import java.io.*;
import java.util.Scanner;

public class JavaCommentRemover {
    public static void main(String[] args) {
        System.out.print("Filename (e.g. leek.java): ");
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

            String output = oneline.toString();


            //String output = oneline.toString().replaceAll("\\s+"," ");
            strip_comments(output);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void strip_comments(String source){
        StringBuilder output = new StringBuilder();

        boolean commenting = false;
        boolean quotation = false;

        char second = ' ';
        for (int i = 0; i < source.length(); i++) {   
            if (i+1 < source.length()){
                second = source.charAt(i+1);

                System.out.print(source.charAt(i));
                System.out.print(second);
            }
        }
    }
}
