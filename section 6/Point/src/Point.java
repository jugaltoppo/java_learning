public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance()
    {
        return distance(0,0);
    }


//    public double distance()
//    {
//       return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
//    }
    //Good job, Sanjay! :-D If you wanted to work a bit deeper, you could tighten the code up a bit. As a nudge, consider this version of the
    //distance() method:
    //^ You've shown yourself to be a pretty hard worker, so I think you'll probably understand, but I'll give a quick explanation anyway. So,
    //when this distance() method (with no arguments) is called, it gets the data it needs by calling the 2-parameter version of the method, and
    //passing in 0,0 as the values. What the 2-parameter version of the method returns, is returned from the no-parameter version of the method.
    //This let's you reuse code instead of duplicating it.


    public double distance(int x,int y)
    {
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }

    public double distance(Point another)
    {
        return distance(another.x,another.y);
    }
//    public double distance(Point another) {
//        return Math.sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
//    }

    //When you say
    //return distance(0, 0);
    //^This will call the distance method with 2 parameters (0,0 - the point we're calculating from), and it will get the values from the
    //instance variables
    //are we saying that this calls
    //return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    //inputting 0 and 0 for x and y respectively, then uses getX and getY as the instance variables?
    //So in effect this is overloading return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY())); ?

}
