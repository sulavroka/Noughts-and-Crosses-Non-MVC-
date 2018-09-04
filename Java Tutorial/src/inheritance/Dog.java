package inheritance;

public class Dog extends Animal{

	
	public Dog(String name, int age){
		super(name,age);
	}
	
	public void whatAmI(){
		System.out.println("I am a Dog");
	}
	

	
}
