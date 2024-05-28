import java.util.Scanner;

public class Phone {
    static String make;
    static String model;
    static double storage;
    static int option;
    static int choice;
    static int modelPrice;
    static int choose;
    static int storagePrice;
    static int totalPrice;
    Scanner sc = new Scanner(System.in);

    public String getMake() {
        System.out.println("choose Option 1: Apple Option 2 : Samsumg ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                make = "Apple";
                break;
            case 2:
                make = " Samsung";

        }
        return make;
    }

    public String model() {
        if (option == 1) {
            System.out.println("choose the choice 1: apple13 choice 2: apple 14");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    model = "apple 13";
                    modelPrice = 300;

                    break;
                }
                case 2: {
                    model = "apple 14";
                    modelPrice = 400;
                    break;

                }
                default:
                    System.out.println("invalid choice, please enter valid choice ");
            }

        }
        else if (option  == 2) {
            System.out.println("choose the choice 1: Smasung S1 choice 2: Samsung s2");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    model = "Samsung s1";
                    modelPrice = 100;

                    break;

                }
                case 2: {
                    model = "Samsung s2";
                    modelPrice = 200;
                    break;

                }
                default:
                    System.out.println("invalid choice, please enter valid choice ");
            }


        }
        return model;
    }


    public int storage() {
        System.out.println("choose a  storage choice 1: 64gb choice 2: 128gb");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                storage=64;
                storagePrice = 100;
                totalPrice = storagePrice + modelPrice;
                break;
            case 2:
                storage=128;
                storagePrice = 150;
                totalPrice = storagePrice + modelPrice;
                break;
            default:
                System.out.println("invalid choice, please enter valid choice ");
        }
        return totalPrice;
    }

    public void printDetails() {
        System.out.println("Phone Make: " + make);
        System.out.println("Phone Model: " + model);
        System.out.println("Phone Storage: " + storage + "GB");
        System.out.println("Phone Price: $" + totalPrice);
    }

    public static void main(String[] args) {
        Phone ph =new Phone();
        ph.getMake();
        ph.model();
        ph.storage();
        ph.printDetails();

    }
}
