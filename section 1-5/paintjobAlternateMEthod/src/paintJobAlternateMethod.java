public class paintJobAlternateMethod {
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }
        else
        {
            double area=width*height;
            double bucket=areaPerBucket*extraBuckets;
            double trail = area-bucket;
            double trail2 = Math.ceil(trail/areaPerBucket);
            return (int)trail2;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0 )
        {
            return -1;
        }
        else
        {
            double area=width*height;
            double bucket=areaPerBucket;
            double needed = Math.ceil(area/bucket);
            return (int)needed;
        }
    }
    public static int getBucketCount(double area,double areaPerBucket)
    {
        if(area<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            double needed = Math.ceil(area/areaPerBucket);
            return (int)needed;
        }
    }
}
