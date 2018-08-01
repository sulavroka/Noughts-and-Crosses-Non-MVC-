package linkedlist;

public class linkedlist<E> {

	private link<E> head;		// head node of the list or the first link
	private link<E> tail;		// tail (last) node of the list
	private int size;
	
	//default constructor with empty list
	public linkedlist(){
		head=null;
		tail=null;
		size = 0;
	}
	public int getSize(){
		return size;
	}
	//returns true if Linklist is empty
	public boolean isEmpty(){
		return(head == null);
	}
	
	public void insertAtHead(E data){
		head = new link<E>(data,head);
		size++;
		
		if(size == 1){
			tail=head;
		}
		
	}
	
	public E removeHead(){
		if(!isEmpty()){
			E data = head.getData();
			head = head.getNewLink();
			size--;	
			
			if(head==null){
			  tail=null;
			}
			
		}
		return null;
		
	}
	
	public String toString() {
		String s = new String("[ ");
		link<E> cursor = head;
		while ( cursor != null ) {
			s += cursor.getData() + " ";
			cursor = cursor.getNewLink();
		}
		return ( s + "]");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist <Integer> list = new linkedlist<Integer>();
		list.insertAtHead(1);
		list.insertAtHead(2);
		list.insertAtHead(3);
		list.insertAtHead(4);
		System.out.println(list);
		list.removeHead();
		System.out.println(list);
		
	}

}
