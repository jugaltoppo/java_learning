public class paintJob {
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(0.75,0.75,0.5));
        System.out.println(getBucketCount(6.26,2.2));
    }
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBucket)
    {
        if(width<=0 || height <=0 || areaPerBucket<=0 || extraBucket<0)
        {
            return -1;
        }
        else
        {

            if(extraBucket==0)
            {
                return getBucketCount(width,height,areaPerBucket);
            }
            double area=width*height;
            double totalBucketsNeeded=Math.ceil(area/areaPerBucket);
            double bucketneeded=totalBucketsNeeded-extraBucket;
            System.out.println(bucketneeded);
            return (int)bucketneeded;

        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width<=0 || height<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            double area=width*height;
            double totalBucket=Math.ceil(area/areaPerBucket);
           return (int)totalBucket;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            double bucket=Math.ceil(area/areaPerBucket);
            return (int)bucket;
        }

    }
}
