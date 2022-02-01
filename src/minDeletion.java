import java.util.Scanner;

public class minDeletion {
    //Paxton has been given strings containing only two letters X and Y.
    // He has to reduce each string such that there are no matching adjacent characters
    // present in the string. For that, he can delete zero or more characters.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s =sc.nextLine();
        int count =0;//to count no.of deletion
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
