import java.util.Scanner;
public class OopMasterChallenge {
    public static void main(String[] args) {

        System.out.println("Welcome to Jugals' burger service\n");
        System.out.println("Select 1 for Normal Hamburger \nSelect 2 for Healthy Hamburger \nSelect 3 for Delux Hamburger");
        Scanner burgerSelection = new Scanner(System.in);
        int selection = burgerSelection.nextInt();
        burgerSelection.nextLine();
        if (selection == 1) {
            System.out.println("enter your name, your Bread Roll Type and Meat");
            Scanner name = new Scanner(System.in);
            String customerName = name.nextLine();
            String rollType = name.nextLine();
            String meat = name.nextLine();

            Hamburger burger = new Hamburger(customerName, rollType, meat);
            int total = burger.getBasePrice();
            System.out.println("Would you like to add extras \ntype 1 for yes or 2 for no");
            int extras = burgerSelection.nextInt();
            burgerSelection.nextLine();
            if (extras == 1) {
                System.out.println("type 1 for lettuce  -> price " + burger.getLettucePrice() + "\n" +
                        "type 2 for toamto  -> price " + burger.getTomatoPrice() + "\n" +
                        "type 3 for carrot  -> price " + burger.getCarrotPrice() + "\n" +
                        "type 4 for mayo  -> price " + burger.getMayoPrice());
                int lettuce = burgerSelection.nextInt();
                if (lettuce == 1) {
                    total += burger.getLettucePrice();
                    System.out.println("cart total " + total);
                }
                int tomato = burgerSelection.nextInt();
                if (tomato == 2) {
                    total += burger.getTomatoPrice();
                    System.out.println("cart total " + total);
                }
                int carrot = burgerSelection.nextInt();
                if (carrot == 3) {
                    total += burger.getCarrotPrice();
                    System.out.println("cart total " + total);
                }
                int mayo = burgerSelection.nextInt();
                if (mayo == 4) {
                    total += burger.getMayoPrice();
                    System.out.println("cart total " + total);
                }


            }

            System.out.println(total);
        } else if (selection == 2) {
            System.out.println("enter your name, your Bread Roll Type and Meat");
            Scanner name1 = new Scanner(System.in);
            String customerName = name1.nextLine();
            String rollType = name1.nextLine();
            String meat = name1.nextLine();

            HealthyBurger burger1 = new HealthyBurger(customerName, rollType, meat);
            int total = burger1.getBasePrice();
            System.out.println("Would you like to add extras \ntype 1 for yes or 2 for no");
            int extras = burgerSelection.nextInt();
            burgerSelection.nextLine();
            if (extras == 1) {
                System.out.println("type 1 for lettuce  -> price " + burger1.getLettucePrice() + "\n" +
                        "type 2 for toamto  -> price " + burger1.getTomatoPrice() + "\n" +
                        "type 3 for carrot  -> price " + burger1.getCarrotPrice() + "\n" +
                        "type 4 for mayo  -> price " + burger1.getMayoPrice()+ "\n" +
                        "type 5 for mayo  -> price " + burger1.getCabbageprice()+ "\n" +
                        "type 6 for mayo  -> price " + burger1.getSauseprice()+ "\n" );
                int lettuce = burgerSelection.nextInt();
                if (lettuce == 1) {
                    total += burger1.getLettucePrice();
                    System.out.println("cart total " + total);
                }
                int tomato = burgerSelection.nextInt();
                if (tomato == 2) {
                    total += burger1.getTomatoPrice();
                    System.out.println("cart total " + total);
                }
                int carrot = burgerSelection.nextInt();
                if (carrot == 3) {
                    total += burger1.getCarrotPrice();
                    System.out.println("cart total " + total);
                }
                int mayo = burgerSelection.nextInt();
                if (mayo == 4) {
                    total += burger1.getMayoPrice();
                    System.out.println("cart total " + total);
                }
                int cabbage = burgerSelection.nextInt();
                if (cabbage == 5) {
                    total += burger1.getCabbageprice();
                    System.out.println("cart total " + total);
                }
                int sause = burgerSelection.nextInt();
                if (sause == 6) {
                    total += burger1.getSauseprice();
                    System.out.println("cart total " + total);
                }

            }
            System.out.println(total);
        }
        else if(selection==3)
        {
            System.out.println("enter your name, your Bread Roll Type and Meat");
            Scanner name1 = new Scanner(System.in);
            String customerName = name1.nextLine();
            String rollType = name1.nextLine();
            String meat = name1.nextLine();

            DeluxBurger burger2 = new DeluxBurger(customerName, rollType, meat);
            int total = burger2.getBasePrice()+burger2.getChipsprice()+burger2.getDrinksprice();

            System.out.println(total);
        }
    }
}
