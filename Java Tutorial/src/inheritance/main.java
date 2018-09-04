package inheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tommy = new Dog("tommy", 2);
		
		tommy.whatAmI();
		// instance of 
		//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
		//If we apply the instanceof operator with any variable that has null value, it returns false.
		
		System.out.println(tommy instanceof Animal);
		
		//polymorphism
		
		Animal a = new Cat("Pus",2);
		a.whatAmI();
		
		
	}

}
