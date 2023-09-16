/* 
Abstraction demonstrated by abstracting the common
behaviors of animals into the 'Animal' class, creating
specific sublcasses like 'Dog' and 'Cat' that provide
specialized implementations of the 'speak' method.

Inheritance demonstrated by the relationship between
'Animal' superclass and its subclasses 'Dog' and 'Cat',
inheriting the 'name' attribute and the 'speak' method.

*/


class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
 