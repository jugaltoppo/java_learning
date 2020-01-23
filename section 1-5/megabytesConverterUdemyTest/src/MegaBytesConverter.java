public class MegaBytesConverter {
    public static void  main (String args[])
    {
        printMegaBytesAndKiloBytes(2586);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int convertedValue= kiloBytes / 1024;
            int remainingValue = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB " + "= " + convertedValue + " MB " + "and " + remainingValue + " KB");
        }
    }
}
