

class Animal {
    String sound(){
        return "Animal Sound";
    }
}

class Dog extends Animal{
    public String name;
    String sound(){
        return "Dog barks";
    }

    String sound(String name){
        this.name = name;
        return name+" also Barks";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        System.out.println(animal1.sound());
//        System.out.println(animal1.sound("Tommy"));
    }
}
