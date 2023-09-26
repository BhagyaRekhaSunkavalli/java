import java.io.*;
abstract class Animal {
    public abstract void AnimalSound();//abstract method
    public void Sleep() { //compliet method
    System.out.println("zzzzzzzz.......");
    }//Animal sound class end
}
class Cow extends Animal {
    public void AnimalSound() {
        System.out.println("Cow says maaaa");
    }
}
public class AbstractionDemo {
    public static void main(String args[]) {
        Cow c=new Cow();
        c.AnimalSound();//child class method
        c.Sleep(); //parent class method
    }
}
