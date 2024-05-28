import java.util.Scanner;

public class TV {
    String brand;
    double size;
    double price;
    int option;
    int choice;
    double discount;
    double disPrice;
    double disAmount;
    Scanner sc=new Scanner(System.in);
    public String getBrand() {
        System.out.println("choose  a Brand  option 1 : LG  option 2: sony");
        option= sc.nextInt();
        switch(option){
            case 1:
                brand="LG";
                price=40000;
            case 2:
                brand="sony";
                price=60000;
        }

        return brand;
    }

    public double getSizes(){
        System.out.println("choose a size  choice 1: 45   choice 2: 55");
        choice= sc.nextInt();
        switch(choice){
            case 1:
                size=45;
                discount=5;
                disAmount=price*(discount/100);
                disPrice=price-disAmount;
                break;
            case 2:
                size=55;
                discount=10;
                disAmount=price*(discount/100);
                disPrice=price-disAmount;

        }
        return disPrice;
    }

    public void printDetails() {
        System.out.println("brand" + brand);
        System.out.println("Size" + size);
        System.out.println("price: " + price);
        System.out.println("disAmount: " + disAmount);
        System.out.println("disPrice : " + disPrice );



    }

    public static void main(String[] args) {
        TV t=new TV();
        t.getBrand();
        t.getSizes();
        t.printDetails();
    }

}
