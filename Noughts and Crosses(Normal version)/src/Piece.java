
public class Piece {

	private boolean isNought;
	
	public Piece(boolean isNought){
		this.isNought = isNought;
	}
	
	
	// if the last move for example is nought then the next move will be cross
	public Piece(Piece lastMove){
		isNought = !lastMove.isNought;
	}
	
	public String toString(){
		if(isNought){
			return "O";
		}
		else{
			return "X";
		} 
	}
	
	
	
	
	
}
