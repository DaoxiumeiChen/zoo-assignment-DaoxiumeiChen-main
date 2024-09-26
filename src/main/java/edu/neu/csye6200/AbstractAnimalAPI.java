package edu.neu.csye6200;

abstract class AbstractAnimalAPI {
    private final String name;

    public AbstractAnimalAPI(String name) {
        this.name = name;
    }

    public abstract String Sound();

    public String toString() {
        return name + "Sound is " + Sound();
    }
}

 class AbstractSnake extends AbstractAnimalAPI{
        public AbstractSnake(String name){
            super(name);
        }
       @Override
        public String Sound(){
            return "Hiss";
        }
    }

    class AbstractRabbit extends AbstractAnimalAPI{
     public AbstractRabbit(String name){
         super(name);
     }
     @Override
     public String Sound(){
         return " Mumble";
     }
    }