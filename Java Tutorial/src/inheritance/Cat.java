package inheritance;

public class Cat extends Animal {


	public Cat(String name, int age){
		super(name,age);
	}
	
	
	public void whatAmI(){
		System.out.println("I am a cat");
	}
}
