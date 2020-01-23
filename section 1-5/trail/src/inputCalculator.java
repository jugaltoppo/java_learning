import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args)
    {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum=0,count=0;
        Scanner scan1=new Scanner(System.in);
        while(true) {
            boolean check = scan1.hasNextInt();
            if (check) {
                int number = scan1.nextInt();
                sum += number;
                count++;

            } else {
                int average=(int)Math.round((double)sum/count);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scan1.close();
    }
}
