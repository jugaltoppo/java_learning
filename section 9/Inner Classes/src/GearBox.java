import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gear;
    private int maxGear;
    private int currentGear;
    private boolean clutchIsIn;
    public GearBox(int maxGear)
    {
        this.maxGear=maxGear;
        this.gear=new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gear.add(neutral);

        for (int i=0;i<maxGear;i++)
        {
            addGear(i,i*5.3);
        }
    }

    public void operateClutch(boolean in)
    {
        this.clutchIsIn=in;
    }

    public void addGear(int number, double ratio)
    {
        if(number>0 && number<=maxGear)
        {
            this.gear.add(new Gear(number,ratio));
        }
    }

    public void changegear(int number)
    {
        if(number>0 && number<gear.size() && clutchIsIn)
        {
            this.currentGear=number;
            System.out.println("Gear " + number + " selected");
        }
        else
        {
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int rev)
    {
        if(clutchIsIn)
        {
            System.out.println("Scream");
            return 0.0;
        }
        else
        {
            return rev * gear.get(currentGear).getRatio();
        }
    }

    private class Gear
    {
        private int gearNumber;
        private double ratio;
        public Gear(int gearNumber,double ratio)
        {
            this.gearNumber=gearNumber;
            this.ratio=ratio;
        }

        public double getRatio()
        {
            return this.ratio;
        }

        public double driveSpreed(int revs)
        {
            return revs * this.ratio;
        }
    }
}
