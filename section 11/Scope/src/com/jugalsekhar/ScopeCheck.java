package com.jugalsekhar;

public class ScopeCheck {
    public int publicvVar=0;
    private int var1 =1;
    
    public ScopeCheck()
    {
        System.out.println("this is inside constructor   publicVar : " + publicvVar + " var1: " + var1);
    }
    public int getVar1()
    {
        return var1;
    }

    public void timesTwo()
    {
        int var2=2;
        for(int i=0;i<10;i++)
        {
            System.out.println(i + " times " + var2 + " equal to : " + i*var2);
        }
    }

    public void useInner()
    {
        InnerClass innerClass = new InnerClass();
        System.out.println("method from outer class showing value of var 3 from inner class "+ innerClass.var3);
    }

    public class InnerClass
    {
        private int var3 =3;
        public InnerClass()
        {
            System.out.println("(inside inner class constructor) InnerClass created, " + "var1 is " + var1 + " var3 is " + var3);
        }

        public void timesTwo()
        {
//            int var3 = 2;
//            ScopeCheck.this.timesTwo();   procedure to use method from outerclass    use .this keyword
            System.out.println("(inner class times two method) var1 is still available here " + var1);
            for(int i=0;i<10;i++)
            {
                System.out.println(i + "times " + var3 + " equals to: " + i* var3);
            }
        }
    }
}
