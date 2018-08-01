package Arrraylist;

import java.util.ArrayList;

public class Array {

	public static ArrayList<Integer> ss = new ArrayList<Integer>();
	
	 static int n;
	public void add(int data){
		ss.add(data);
	}
	
	public void remove (int data){
		ss.remove(data);
	}
	 
	public static int check(){
		 n=1;
		if (n>2){
			 n--;
		}
		return ++n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());
		
	}

}
