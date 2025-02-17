import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet pet1 = new Pet();
        System.out.println(pet1);

        Pet pet2 = new Pet("Bella", "dog", 16);
        System.out.println(pet2);

        Pet pet3 = new Pet("Sheeba", "ferret", 6);
        System.out.println(pet3);

        System.out.println("Enter animal type:");
        String type = scanner.nextLine();

        System.out.println("Enter animal name:");
        String name = scanner.nextLine();

        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        Pet pet4 = new Pet(name, type, age);
        System.out.println(pet4);

        pet4.setName("Updated Name");
        pet4.setAge(5);
        System.out.println("Updated Pet 4:");
        System.out.println(pet4);

        scanner.close();
    }
}
