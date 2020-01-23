import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Buttons btnPrint = new Buttons("print");
    public static void main(String[] args)
    {
        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(1,12.3);   //was valid when the gear class is public in GearBox class
//        System.out.println(first.driveSpreed(1000));


//        mcLaren.operateClutch(true);
//        mcLaren.changegear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//
//        mcLaren.changegear(1);
//        System.out.println(mcLaren.wheelSpeed(1000));

//        class ClickListener implements Buttons.IOnClickListener   //local class since its inside main method
//        {
//            public ClickListener()
//            {
//                System.out.println("i have been attached");
//            }
//
//            public void onclick(String title)
//            {
//                System.out.println(title + " Was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());   // local class ends here...kinda

        btnPrint.setOnClickListener(new Buttons.IOnClickListener()
        {
            public void onclick(String title)
            {
                System.out.println(title + " has been clicked");
            }
        }
        );
        listen();
    }

    public static void listen()
    {
        boolean check=true;
        while (check)
        {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    check=false;
                    break;
                case 1:
                    btnPrint.OnClick();
            }
        }
    }
}
