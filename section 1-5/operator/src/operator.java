public class operator {
    public static void main(String[] args)
    {
        int result=1+2;
        System.out.println("1+2= " + result);
        int previousresult=result;
        result=result-1;
        System.out.println(previousresult + "-1" + result);
        previousresult=result;
        result=result*10;
        System.out.println(previousresult + "*10=" + result);
        previousresult=result;
        result=result/5;
        System.out.println(previousresult + "/5=" + result);
        previousresult=result;
        result=result%3;
        System.out.println(previousresult + "%3=" + result);
        previousresult=result;
        result=result+1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);
        result += 2;
        System.out.println("result is now " + result);
        result *= 10;
        System.out.println("result is now " + result);
        result -= 10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);

        boolean isalien=false;
        if (isalien==false)
            System.out.println("it is not an alien");
        int topscore=80;
        if (topscore <= 100)
            System.out.println("you got the highest score");
        int secondtopscore =60;
        if ((topscore>secondtopscore) && (topscore<100))
            System.out.println("greater than second top score and less than 100");
        if (topscore >900 || secondtopscore<100)
            System.out.println("condition applies");

        boolean iscar=false;
        if(iscar)
            System.out.println("this is not supposed to happen");

        //ternary operator
        iscar=true;
        boolean wascar=iscar?true:false;
        if (wascar)
            System.out.println("was car is true");

        // challenge

        double my1stval=20d;
        double my2ndval=80d;
        double mytotal = (my1stval + my2ndval) * 25d;
        System.out.println("mytotal is =" + mytotal);
        double remainder = mytotal % 40d;
        System.out.println("my remainder is = " + remainder);
        if (remainder<=20)
            System.out.println("total was over the limit");
    }
}
