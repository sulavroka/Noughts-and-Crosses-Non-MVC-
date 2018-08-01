package statiic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ford = new Car("Ford sx", 4);
		Car s = new Car("Ford sx", 5);
		System.out.println(s.getId());
		Car.printcar(s);
	}

}
