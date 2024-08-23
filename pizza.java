import java.util.*;
public class pizza{

    public static void main(String[] args) {
        System.out.println("        PIZZAHUNT     ");
        System.out.println("****Here our Menu Items!***** ");
        System.out.println(" 1.Chees Pizza ");
        System.out.println(" 2.Chiken Pizza ");
        System.out.println(" 3.Paneer Pizza ");
        System.out.println(" 4.Garlic Knots  Pizza");
        System.out.println(" 5.Chees Breadstics");
        System.out.println(" 6.Caesar Pizza ");
        System.out.println(" 7.Buffalo Wings Pizza ");
        System.out.println("******************* ");
        System.out.println("Please Choose you PIZZA");

        //ENTER Number FOR SELECTING YOUR PIZZA

        Scanner n1= new  Scanner(System.in);
       int  pizza= n1.nextInt();
        switch(pizza){
             case 1:
                System.out.println("Cheese Pizza\n");
                System.out.println("Price:199/\n");

                System.out.println("How many you Wants..?\n");
                Scanner sc= new  Scanner(System.in);
                int order= n1.nextInt();
                 int price=199;
            

              System.out.println("YoUR Total Bill is:"+order*price);
              break;
            case 2:
                System.out.println(" Chiken Pizza\n");
                System.out.println(" Price:299/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n= new  Scanner(System.in);
                int order1 = n.nextInt();
                int price1=299;
                System.out.println("YoUR Total Bill is:"+ order1 *price1);
                break;

            case 3:
                System.out.println(" Paneer Pizza\n");
                System.out.println(" Price:99/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n2= new  Scanner(System.in);
                int order2 = n2.nextInt();
                int price2=99;
                System.out.println("YoUR Total Bill is:"+ order2 *price2);
                break;
            case 4:
                System.out.println(" Garlic Knots  Pizza\n");
                System.out.println(" Price:299/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n3= new  Scanner(System.in);
                int order3 = n3.nextInt();
                int price3=299;
                System.out.println("YoUR Total Bill is:"+ order3 *price3);
                break;
            case 5:
                System.out.println(" Chees Breadstics\n");
                System.out.println(" Price:129/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n4= new  Scanner(System.in);
                int order4 = n4.nextInt();
                int price4=129;
                System.out.println("YoUR Total Bill is:"+ order4 *price4);
                break;

            case 6:
                System.out.println("  Caesar Pizza\n");
                System.out.println("  Price:599/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n5= new  Scanner(System.in);
                int order5 = n5.nextInt();
                int price5=599;
                System.out.println("YoUR Total Bill is:"+ order5 *price5);
                break;

            case 7:
                System.out.println("  Buffalo Wings Pizza\n");
                System.out.println("  Price:398/\n");

                System.out.println("How many you Wants..?\n");
                Scanner n6= new  Scanner(System.in);
                int order6= n6.nextInt();
                int price6=398;
                System.out.println("YoUR Total Bill is:"+ order6 *price6);

                break;

                default:
                System.out.println(" Sorry Not Available !");

        }}}




