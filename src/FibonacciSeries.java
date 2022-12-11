import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args) {
        Scanner y= new Scanner(System.in);
        System.out.println("Enter a no  = ");
        long number= y.nextInt();
        System.out.print("fibonacci Series of "+ number +" \n");
        printFibonacciSeries(number);

    }
    public static long fibonacci(long number)
    {
        if (number<0)
        return -1;

        else if (number==0 || number==1)
            return 1;
        else
        return fibonacci(number-2) + fibonacci(number-1);
    }

    public static void printFibonacciSeries(long number)
    {
        if(number<=1)
            System.out.print(fibonacci(number)+ " ");

        if(number>1){
        printFibonacciSeries(number-1);
        System.out.print(fibonacci(number-1) + " ");
    }

}
}
