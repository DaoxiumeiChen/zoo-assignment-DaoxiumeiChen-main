package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

class ZooAnimalAPI{
    private final List<AnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalAPI animal) {
        animals.add(animal);
    }

     public void showAnimals() {
        for (AnimalAPI animal : animals) {
            System.out.println(animal);
        }
    }
}


class ZooAbstractAnimalAPI {
    private final List<AbstractAnimalAPI> animals = new ArrayList<>();

    public void addAnimal(AbstractAnimalAPI animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (AbstractAnimalAPI animal : animals) {
            System.out.println(animal);
        }
    }
}

class ZooAnimalisticAnimalAPI {
    private final List<AnimalisticAPI> animals = new ArrayList<>();

    public void addAnimal(AnimalisticAPI animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (AnimalisticAPI animal : animals) {
            System.out.println(animal);
        }
    }
}

class ZooObjectAnimals {
    private final List<Object> animals = new ArrayList<>();

    public void addAnimal(Object animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (Object animal : animals) {
            System.out.println(animal);
        }
    }
}



