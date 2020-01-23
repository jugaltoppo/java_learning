import java.util.Scanner;

public class minAndMaxChallengeTimMEthod {
    public static void main(String[] args) {
        Scanner jstscan = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean check1 = true;
        while (true) {
            System.out.println("Enter the number");
            boolean check = jstscan.hasNextInt();
            if (check) {
                int num = jstscan.nextInt();
                while (check1) {
                    check1 = false;
                    min = num;
                    max = num;
                }
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("min: " + min + " max: " + max);
                jstscan.nextLine();
                break;
            }
        }
    }
}
