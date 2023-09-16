/*  Encapsulation and Inheritance
Encapsulation demonstrated by encapsulating the 'name' attribute 
within the 'Animal' class, allowing controlled access through the 
'getName' method

Inheritance demonstrated by the relationship between this 'Animal'
superclass and its subclasses 'Dog' and 'Cat', inheriting the 'name'
attribute and 'speak' method.
*/

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal sound");
    }

    public String getName() {
        return name;
    } 

}
