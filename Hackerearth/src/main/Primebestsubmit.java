package main;
import java.util.Scanner;

class Primebestsubmit {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int num = 2; num < N; num++) {

            int temp;
            boolean isPrime=true;

            for(int i=2;i<=num/2;i++)
            {
                temp=num%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }

            if(isPrime)
                System.out.print(num+ " ");

        }
    }
}