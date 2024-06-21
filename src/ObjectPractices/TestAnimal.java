package ObjectPractices;

public class TestAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.name = "Oreo";
        System.out.println(animal.name);
        animal.name = "Potato";
        System.out.println(animal.name);
        animal.age = 3;

        animal.color = "black";
        animal.numbersOfLeg = 4;
        System.out.println(animal.color);
        System.out.println(animal.age);
        System.out.println(animal.numbersOfLeg);
        //============
        animal.altitude = "Agressive";
        System.out.println(animal.altitude);
        System.out.println("============");
        Animal animall1 = new Animal();
        animall1.numbersOfLeg = 2;
        animall1.color = "brown";
        animall1.age = 12;
        animall1.name = "Oatmeal";
        System.out.println(animall1.color);
        System.out.println(animall1.name);
        System.out.println(animall1.numbersOfLeg);
        System.out.println(animall1.age);
        System.out.println("============");


        animal.eat();
        System.out.println("============");
        animal.sleep = "Sleeping";
        System.out.println(animal.sleep);
        animal.sleep();


    }
}
