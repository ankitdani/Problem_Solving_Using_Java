import java.util.ArrayList;
import java.util.Scanner;

public class Nested_ArrayList_Traversal
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int list1_size=sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<list1_size;i++){
            int temp=sc.nextInt();
            list1.add(temp);
        }
        // System.out.println(list1);

        int list2_size=sc.nextInt();
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i=0;i<list2_size;i++){
            String temp=sc.next();
            list2.add(temp);
            if(temp.equals("Insert")){
                // ArrayList<Integer> list3 = new ArrayList<Integer>();
                Integer pos = sc.nextInt();
                // list3.add(pos);
                Integer num=sc.nextInt();
                // list3.add(num);
                // System.out.println(list3);
                // System.out.println(list1.remove(pos));
                list1.remove(pos);
                list1.add(pos,num);
            }
            if(temp.equals("Delete")){
                int pos=sc.nextInt();
                // System.out.println(list1.remove(pos));
                list1.remove(pos);
            }
        }
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

    }
}
