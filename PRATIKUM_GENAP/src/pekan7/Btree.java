package pekan7;

public class Btree {
	
	private Node root ;
	private Node currentNode;
	public Btree () {
		root = null ; }
	
	public boolean search ( int data) {
		return seacrh (root , data );}
	
	private boolean seacrh (Node node, int data) {
		if ( node.getData ()== data )
			return true;
		if (node.getleft() != null)
		if (seacrh (node.getleft(), data))
					return true;
		if (node.getright() != null)
		if (seacrh (node.getright(),data))
			return true;
		    return false;}
	
	public void prinInorder () {
		root.printInorder(root);}
	public void printPostorder () {
		root.printPostorder(root) ;}
	public void printPreorder () {
		root.printPreorder (root); }
	
	public Node getRoot() { 
		return root ;}
	
	public Node Empty () {
		return root = null ; 
	}
	
	public int countNodes() {
		return countNodes (root);
	}
	private int countNodes (Node node) {
		int count = 1;
		if (node == null ) {
			return 0;
		} else {
			count += countNodes (node.getleft());
			count +=
					countNodes (node.getright());
			return count ;
		}}
	
	public void print () {
		root.print () ;
	}
	
	public Node getCurrent () {
		return currentNode ;
		
	}
	
	public void setCurrent (Node node) {
		this.currentNode = node ;
		
	}
	public void setroot ( Node root ) {
		this.root = root;
		}
}


