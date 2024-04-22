
public class Tamaguchi {

    // Atributos

    @SuppressWarnings("unused")
    private String name, mood;
    private int food, health, age, option;

    // Construtor

    public Tamaguchi(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Metodos

    public void showEatOptions(){
        System.out.println("1 - Banana = 5 Eat");
        System.out.println("2 - Donuts = 10 Eat");
        System.out.println("3 - Hamburguer = 15");
        System.out.println("4 - Pizza = 20 Eat");
        System.out.println("5 - Exit");
    }

    public void Eat(int option){

    
        switch (option) {
            case 1:
                System.out.println("Eating Banana...");
                food += 5;
                break;
            case 2:
                System.out.println("Eating Donuts...");
                food += 10;
                break;
            case 3:
                System.out.println("Eating Hamburguer...");
                food += 15;
                break;
            case 4:
                System.out.println("Eating Pizza...");
                food += 20;
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Digite um opção valido");
                break;
            }
            if (getFood() >= 100) {
                food = 100;
            }
        }
    

    public void Health(int food){
        if (food == 0) {
            health = 0;
        } else if (food > 0 && food <= 25) {
            health = 25;
        } else if (food > 25 && food <= 50) {
            health = 50;
        } else if (food > 50 && food <= 75) {
            health = 75;
        } else {
            health = 100;
        }
    }

    public String mood(){
        if (food == 0 && health == 0) {
            return "Dead";
        } else if (food > 0 && food <= 25 && health > 0 && health <= 25) {
            return "Sad";
        } else if (food > 25 && food <= 50 && health > 25 && health <= 50) {
            return "Impartial";
        } else if (food > 50 && food <= 75 && health > 50 && health <= 75) {
            return "Happy";
        } else {
            return "Euphoric";
        }
    }
    
    public void nameAlteration(String name){
        name = null;
    }

    public void showMe(){
        System.out.printf("Name: %s\n", getName());
        System.out.printf("Age: %d\n", getAge());
        if (getFood() >= 100) {
            System.out.println("Food: Food Completed");
        } else {
            System.out.printf("Food: %d%%\n", food);
        }
        System.out.printf("Health: %d%%\n", health);
        System.out.printf("Mood: %s\n", mood());
    }


    // Getters and Setters 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    // 
}
