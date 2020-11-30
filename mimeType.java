import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        HashMap<String, String> hashMap = new HashMap<>(N);
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            hashMap.put(EXT.toLowerCase(), MT);
        }
        System.err.println(hashMap);
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            if(!FNAME.contains(".")) {
                System.out.println("UNKNOWN");
            }
            else {
                String string;
                do {
                    int index = FNAME.indexOf('.');
                    string = FNAME.substring(index+1);
                    FNAME = string;
                } while (string.contains("."));
                if(hashMap.containsKey(string)) {
                    System.out.println(hashMap.get(string));
                }
                else {System.out.println("UNKNOWN");}
            }


        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        //System.out.println("UNKNOWN");
    }
}