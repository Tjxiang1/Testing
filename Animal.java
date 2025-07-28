public class Animal {
    String name; 
    String species;
    int age;

    String makeNoise(){
        return ("Hi");
    }
}

class Dog extends Animal{

    public Dog(String name, int age) {
        this.species = "Dog";
        this.name = name;
        this.age = age;
    }

    @Override
    String makeNoise(){
        return ("Bark");
    }
    
}
