
import java.util.Scanner;

    public class Dog {
        static String breed;
        static int age;
        static double weight;

        public Dog() {
        }

        public void setAge(int age) {
            Dog.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setBreed(String breed) {
            Dog.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setWeight(double weight) {
            Dog.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public int calculate() {
            return age * 7;
        }

        public static void main(String[] args) {
            Dog dg = new Dog();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the dog breed: ");
            breed = sc.nextLine();
            dg.setBreed(breed);
            dg.getBreed();
            System.out.println("The dog breed is : " + breed);
            System.out.println("Enter a dog age: ");
            age = sc.nextInt();
            dg.setAge(age);
            dg.getAge();
            System.out.println("The dog age is : " + age);
            System.out.println("Enter a dog weight: ");
            weight = sc.nextDouble();
            dg.setWeight(weight);
            dg.getWeight();
            System.out.println("The  dog weight is :  " + weight);
            int result = dg.calculate();
            System.out.println("The dog  age in human years :" + result);
        }
}
