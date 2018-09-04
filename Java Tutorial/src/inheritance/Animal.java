package inheritance;

public class Animal {

	String name;
	int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void whatAmI(){
		System.out.println("I am a Animal");
	}
	
}
