public class Main {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        reverse(myArray);

    }

    public static void reverse(int[] array) {

        {
            int[] value = array;
            System.out.println("array without reversed");
            for (int i = 0; i < value.length; i++) {
                System.out.println("element " + i + " value is " + value[i]);
            }

                System.out.println("Array reversed");
                int[] revArray = new int[value.length];
                for (int j =0;j<revArray.length;j++) {
                    revArray[j]=value[(revArray.length-1)-j];

            }
            for (int i = 0; i < revArray.length; i++) {
                System.out.println("element " + i + " value is " + revArray[i]);
            }
        }
    }
}

