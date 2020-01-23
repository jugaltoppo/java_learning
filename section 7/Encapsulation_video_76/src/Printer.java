public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel,  boolean duplexPrinter)
    {
        this.tonerLevel=tonerLevel;
        this.pagesPrinted=0;
        this.duplexPrinter=duplexPrinter;
    }

    public void fillToner(int level)
    {
        if (this.tonerLevel + level > 100)
        {
            System.out.println("Can't allow that");
        }
        else
        {
            this.tonerLevel += level;
        }
    }

    public void printPage(int pages)
    {

        if(duplexPrinter==true)
        {
            this.pagesPrinted =this.pagesPrinted + ( (int)Math.ceil((double)pages/2 ));
            System.out.println("it is a duplex printer and number of pages printed this session is : " + (int)Math.ceil((double)pages/2 ));
        }
        else
        {
            this.pagesPrinted += pages;
        }
    }

    public int getTonerLevel()
    {
        return this.tonerLevel;
    }
    public int getPagesPrinted()
    {
        return this.pagesPrinted;
    }

}

// tim's solution
//
//
///**
// * Created by dev on 31/07/15.
// */
//public class Printer {
//    private int tonerLevel;
//    private int pagesPrinted;
//    private boolean duplex;
//
//    public Printer(int tonerLevel, boolean duplex) {
//        if(tonerLevel >-1 && tonerLevel <=100) {
//            this.tonerLevel = tonerLevel;
//        } else {
//            this.tonerLevel = -1;
//        }
//
//        this.duplex = duplex;
//        this.pagesPrinted = 0;
//    }
//
//    public int addToner(int tonerAmount) {
//        if(tonerAmount >0 && tonerAmount <=100) {
//            if(this.tonerLevel + tonerAmount >100) {
//                return -1;
//            }
//            this.tonerLevel += tonerAmount;
//            return this.tonerLevel;
//        } else {
//            return -1;
//        }
//    }
//
//    public int printPages(int pages) {
//        int pagesToPrint = pages;
//        if(this.duplex) {
//            pagesToPrint = (pages / 2) + (pages % 2);
//            System.out.println("Printing in duplex mode");
//        }
//        this.pagesPrinted += pagesToPrint;
//        return pagesToPrint;
//    }
//
//    public int getPagesPrinted() {
//        return pagesPrinted;
//    }
//}
