import java.io.*;
class Animal {
    public void AnimalSound() {
        System.out.println("An animal can make sounds");
    }
}
class Cow extends Animal {
    public void AnimalSound() {
        System.out.println("Acow sounds-maa");
    }
}
class Cat extends Animal {
    public void AnimalSound() {
        System.out.println("A cat sounds-Meoww");
    }
}
public class PolymorphismDemo {
public static void main(String args[]) {
        Animal an=new Animal();
        Animal myCow=new Cow();
        Animal myCat=new Cat();
        an.AnimalSound();
        myCow.AnimalSound();
        myCat.AnimalSound();
    }
}

