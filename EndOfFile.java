import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System .in);
        
        int count = 0;
        while(sc.hasNext()){
            String x = sc.nextLine();
            count++;
            System.out.println(count + " "+ x);
        }
        
        sc.close();
    }
}