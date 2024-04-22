// A parte de alteração de nome não está funcional


import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random randomFood = new Random();
        Scanner reader = new Scanner(System.in);

        int options;
        System.out.println("---Tamaguchi---");

        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Age: ");
        int age = reader.nextInt();

        Tamaguchi xunim = new Tamaguchi(name, age);
        int food = randomFood.nextInt(101);
        xunim.setFood(food);
        xunim.setHealth(food);
        xunim.showMe();

        do {
            System.out.println("1 - Change Name");
            System.out.println("2 - Feed");
            System.out.println("3 - Show Informations");
            System.out.print("Option: ");
            options = reader.nextInt();
            int optionsTamaguchi;

            switch (options) {
                case 1:
                    System.out.print("New Name: ");
                    String newName = reader.nextLine();
                    xunim.nameAlteration(newName);
                    reader.nextLine();
                    xunim.setName(newName);
                    break;
                case 2:
                    xunim.showEatOptions();
                    System.out.println("Option: ");
                    optionsTamaguchi = reader.nextInt();
                    xunim.setOption(optionsTamaguchi);
                    xunim.Eat(optionsTamaguchi);
                    xunim.Health(xunim.getFood());
                    break;
                case 3:
                    xunim.showMe();
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        } while (options != 5);
        reader.close();
    }
}
