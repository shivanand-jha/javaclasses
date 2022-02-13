import java.util.Scanner;

public class findDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int count = 0;
        for(int i=0; i<N;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(a[i]==a[j]){
                    count++;
                    System.out.println(i);
                }
            }
        }
    }
}