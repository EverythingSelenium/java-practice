package inheritance;

public class InheritanceExample {

    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());

        /**Method Over Riding*/

        Animal animal1 = new Animal();
        System.out.println("animal1.sound() = " + animal1.sound());

        Cat cat1 = new Cat(false, "mouse", 4, "grey");
        System.out.println("cat1.sound() = " + cat1.sound());

        /**Dynamic Binding*/
        Animal animal2 = new Cat(false, "milk", 4, "yellow");
        System.out.println("animal2.sound() = " + animal2.sound());

    }
}
