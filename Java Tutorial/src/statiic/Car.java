package statiic;

public class Car {
	
	String name;
	int wheels;
	static int id = 5;
	

	public Car(String name, int wheels){
		this.name = name;
		this.wheels= wheels;
		id++;
	}
	
	public static void printcar(Car car){
		System.out.println(car);
	}
	
	public String toString(){
		return name + wheels;
		
	}
	
	public int getId(){
		return id;
	}


}
