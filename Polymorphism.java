package Polymorphism;

/* abstract class Animal {
	//abstract method (does not have a body)
	public abstract void animalSound();
	//regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}
//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}
public class Polymorphism{
	public static void main(String [] args) {
		Pig myPig = new Pig(); //Create a pig object
		myPig.animalSound();
		myPig.sleep();
	}
} */

// Enum exercise
enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class Polymorphism{
	public static void main(String[]args) {
		for (Level myVar : Level.values()) {
			System.out.println(myVar);
		}
	}
}