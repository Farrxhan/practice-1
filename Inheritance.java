
// Base class 
class Animal {
    void eat() {
        System.out.println("This is a Carnivorous Animal.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }
}

// Hierarchical Inheritance:
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("The lion roars.");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        // Multilevel Inheritance
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.play();

        // Hierarchical Inheritance
        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();

        Lion myLion = new Lion();
        myLion.eat();
        myLion.roar();

        
    }
}

