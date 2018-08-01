package linkedlist;

public class link<E> {
	
	private E data;
	private link<E> newLink;
	
	//create a link with null reference 
	public link(){
		this(null,null);
	}
	
	//create a node with given node 
	public link(E data, link<E> newLink){
		this.data=data;
		this.newLink = newLink;
	}
	
	public E getData(){
		return data;
	}
	
	public void setData(E data){
		this.data = data;
	}
	
	public Node<e> getNewLink(link<E> new )
	
	
}
