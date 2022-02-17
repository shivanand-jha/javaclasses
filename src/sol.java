import java.util.Scanner;

public class sol {
        // Write your printDivisor function here
        public void printDivisor(int n){
            for (int i=1; i<=n; i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        public static void main(String args[]) {
            sol obj = new sol();
            System.out.println("Enter the number");
            Scanner sc =  new Scanner(System.in);
            int n = sc.nextInt();
            obj.printDivisor(n);
        }
    }

