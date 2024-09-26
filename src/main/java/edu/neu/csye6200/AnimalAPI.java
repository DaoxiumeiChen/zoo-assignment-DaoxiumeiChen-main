package edu.neu.csye6200;

public class AnimalAPI {
    private final String name;

    public AnimalAPI(String name) {
        this.name = name;
    }

    public String Sound() {
        return "Animal Sound";
    }

    public String toString() {
        return name + "Sound is " + Sound();
    }
}
class Snake extends AnimalAPI{
    public Snake(String name) {
        super(name);
    }

    @Override
     public String Sound(){
         return "Hiss";
     }
    }
class Rabbit extends AnimalAPI{
    public Rabbit(String name) {
        super(name);
    }

    @Override
     public String Sound(){
         return " Mumble";
     }
    }
