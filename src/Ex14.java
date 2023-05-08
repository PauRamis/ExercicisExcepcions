//Per que el programa funcioni, tant main com makeSound han de poder fer excepcions
//(Afegint "throws muteException")
public class Ex14 {
    public static void main(String[] args) throws muteException {// afegim el "throws muteException"
        Animal a = new Dog();
        a.makeSound();
    }
}

class muteException extends Exception {
}

abstract class Animal {
    abstract void makeSound() throws muteException; // afegim el "throws muteException"
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class MuteBird extends Animal {
    @Override
    void makeSound() throws muteException {
        throw new muteException();
    }
}