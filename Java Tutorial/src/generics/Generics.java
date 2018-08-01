package generics;

public class Generics {

	
	
	// you can only pass object not data type for example Integer not int.
	public <E>void printarray(E[]array){
		 for(E element: array){
			 System.out.println(element);
		 }
	}
	
	public static <T extends Comparable <T>>T findMax(T a , T b){
		int n = a.compareTo(b);
		if(n<0){
			return b;
		}else{
			return a;
		}
	}

	public static void main(String[]args){
		System.out.println(findMax(5,16));
	}
	
}
