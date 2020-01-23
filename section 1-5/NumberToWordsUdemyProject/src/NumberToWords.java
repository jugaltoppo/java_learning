
    public class NumberToWords
    {
        public static final String INVALID="Invalid Value";
        public static void main(String args[])
        {
            numberToWords(123);
            System.out.println("*********");
            numberToWords(1010);
            System.out.println("*********");
            numberToWords(1000);
            System.out.println("*********");
            numberToWords(-12);
            System.out.println("*********");
            System.out.println(getDigitCount(11));
            System.out.println("*********");
            System.out.println(getDigitCount(0));
        }
        public static void numberToWords(int number) {
        int b = reverse(number);
        int c = getDigitCount(number) - getDigitCount(reverse(number));
        if (number == 0) {
            System.out.println("Zero");
        }
        if (b < 0) {
            System.out.println("Invalid Value");
        } else {
            while (b != 0) {
                int extract = b % 10;
                b = b / 10;

                switch (extract) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");

                }
            }
            for (int i = 0; i < c; i++) {
                System.out.println("Zero");
            }

        }

    }

    public static int reverse(int number) {
        int sum = 0;
        while (number != 0) {
            int ext = number % 10;
            sum = (sum * 10) + ext;
            number = number / 10;
        }
        return sum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            if (number == 0) {
                sum = 1;
            } else {
                while (number != 0) {
                    int ext = number % 10;
                    sum++;
                    number /= 10;

                }
            }

            return sum;
        }
    }
}
