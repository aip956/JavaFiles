/* 
Abstraction and Polymorphism

Polymorphism is shown in the 'main' method when the 'speak'
method is called on both 'Dog' and 'Cat' objects. Despite 
being different types ('Animal', 'Dog', 'Cat'), they are 
treated uniformly as 'Animal' objects and exhibit different 
behaviors due to method overriding.

Abstraction is demonstrated by abstracting the common behaviors
of animals into the Animal class, and creating specific 
subclasses like Dog and Cat that provide specialized implementations 
of the speak method.

*/ 
public class OOPExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Rover");
        Animal cat = new Cat("Pepper");

        System.out.println("Dog name: " + dog.getName());
        dog.speak();

        System.out.println("Cat name: " + cat.getName());
        cat.speak();
    }
}