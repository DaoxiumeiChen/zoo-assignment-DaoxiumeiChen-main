package edu.neu.csye6200;

/**
 * 
 * @author Gokul Jayavel
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");


		AnimalAPI Snake = new Snake("Snake");
		AnimalAPI Rabbit = new Rabbit("Rabbit");


		AbstractAnimalAPI abstractSnake = new AbstractSnake("Abstract Snake");
		AbstractAnimalAPI abstractRabbit = new AbstractRabbit("Abstract Rabbit");


		AnimalisticAPI interfaceSnake = new InterfaceSnake();
		AnimalisticAPI interfaceRabbit = new InterfaceRabbit();


		ZooAnimalAPI zooAnimals = new ZooAnimalAPI();
		zooAnimals.addAnimal(Snake);
		zooAnimals.addAnimal(Rabbit);
        zooAnimals.showAnimals();

		ZooAbstractAnimalAPI zooAbstract = new ZooAbstractAnimalAPI();
		zooAbstract.addAnimal(abstractSnake);
		zooAbstract.addAnimal(abstractRabbit);
        zooAbstract.showAnimals();

		ZooAnimalisticAnimalAPI zooAnimalistic = new ZooAnimalisticAnimalAPI();
		zooAnimalistic.addAnimal(interfaceSnake);
		zooAnimalistic.addAnimal(interfaceRabbit);
        zooAnimalistic.showAnimals();

		ZooObjectAnimals zooObject = new ZooObjectAnimals();
		zooObject.addAnimal(Snake);
		zooObject.addAnimal(Rabbit);
		zooObject.addAnimal(abstractSnake);
		zooObject.addAnimal(abstractRabbit);
		zooObject.addAnimal(interfaceSnake);
		zooObject.addAnimal(interfaceRabbit);
        zooObject.showAnimals();

		System.out.println("\n\n============Main Execution End===================");
	}
}