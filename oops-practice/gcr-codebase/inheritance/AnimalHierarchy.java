class Animal {
  String name;
  int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void makeSound() {
    System.out.println("All animals have some sound");
  }
}

class Dog extends Animal {
  public Dog(String name, int age) {
    super(name, age);
  }

  void makeSound() {
    System.out.println("Dog Barks");
  }
}

class Cat extends Animal {
  public Cat(String name, int age) {
    super(name, age);
  }

  void makeSound() {
    System.out.println("Cat mews");
  }
}

class Bird extends Animal {
  public Bird(String name, int age) {
    super(name, age);
  }

  void makeSound() {
    System.out.println("Bird chirps");
  }
}

public class AnimalHierarchy {
  public static void main(String[] args) {
    Dog d1 = new Dog("Rocky", 5);
    d1.makeSound();
    Cat c1 = new Cat("Kitty", 2);
    c1.makeSound();
    Bird b1 = new Bird("pupi", 1);
    b1.makeSound();
  }
}
