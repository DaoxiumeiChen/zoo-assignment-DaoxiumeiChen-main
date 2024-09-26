package edu.neu.csye6200;
interface AnimalisticAPI {

    String toString();
}

class InterfaceSnake implements AnimalisticAPI {
    private String Sound() {
        return "Hiss";
    }

    @Override
    public String toString() {
        return "Snake sound is " + Sound();
    }
}

class InterfaceRabbit implements AnimalisticAPI {
    private String Sound() {
        return "Mumble";
    }

    @Override
    public String toString() {
        return "Rabbit sound is " + Sound();
    }
}
