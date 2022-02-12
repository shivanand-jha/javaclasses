import java.util.*;
import java.lang.*;

public class factorial_mul {



public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr=new int[T];
        int n;
        int p=0;
        for(int i=0;i<T;i++)
        {
            arr[i]=sc.nextInt();
        }
        while(p<T)
        {
            n=1;
            for(int i=1;i<=arr[p];i++)
            {
                n=n*i;
            } p++;
            System.out.println(n);

        }
    }
}
