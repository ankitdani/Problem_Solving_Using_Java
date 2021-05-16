import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Finding_SubStrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        SortedSet<String> list1=new TreeSet<String>();
        String str="";
        for(int i=0;i<s.length()-k;i++){
            list1.add(str.substring(i,i+k));
        }
        smallest = list1.first();
        largest = list1.last();
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}