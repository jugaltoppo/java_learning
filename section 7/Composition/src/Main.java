public class Main {
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("Gl62","MSI","240",dimensions);

        Monitor monitor = new Monitor("MSi 16'","Micro Star International", 16,new Resolution(1024,1024)); //shortcut without creating instance of resolution

        Motherboard motherboard = new Motherboard("MSi","Micro Star",2, 1, "v1.0");

        PC pc = new PC(theCase,monitor,motherboard);
        pc.getMonitor().drawPixelAt(1500,1200,"red"); //accessing methods through  PC class on Monitor class
        pc.getMotherboard().loadProgram("Java");
        pc.getTheCase().pressPowerButton();

        // practise

        System.out.println("case: " + theCase.getModel() + "\n manufacturer : " + theCase.getManufacturer() + "\n Power supply : " + theCase.getPowersupply() + "\n with dimension: " + theCase.getDimensions() );


//        PC thePC = new PC(new Case("Gl62","MSI","240",new Dimensions(20,20,5)),                         ]
//                new Monitor("MSi 16'","Micro Star International", 16,new Resolution(1024,1024)),        ]
//                new Motherboard("MSi","Micro Star",2, 1, "v1.0"));                                      ]--- just a shortcut without creating instance for each class
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");                                                ]
//        thePC.getMotherboard().loadProgram("Java");                                                     ]
//        thePC.getTheCase().pressPowerButton();                                                          ]



        // next video
        PC newPc = new PC(theCase,monitor,motherboard);
        newPc.powerup();
    }
}
