package thiss;

public class thiss {

	private int x ,y;
	private int width;
	private int k;
	//this refers to current object
	public thiss(){
		this(1,2,3,4);
	}
	
	public thiss(int x,int y,int z,int k){
		this.x = x;
		this.y=y;
		width = z;
		this.k=k;
	}
	
}
