package pekan7;

public class TreeMain {
	
	public static void main (String [] args ) {
		
		Btree tree = new Btree () ;
		System.out.println( " jumlah simpul pohon : ");
		System.out.println(tree.countNodes() );
		Node root = new Node (1);
		tree.setroot(root);
		System.out.println(" jumlah simpul jika hanya ada root ");
		System.out.println(tree.countNodes());
		Node node2 = new Node (2);
		Node node3 = new Node(3);
		Node node4 = new Node (4);
		Node node5 = new Node (5);
		Node node6 = new Node (6);
		Node node7 = new Node (7);
		
		root.setleft(node2);
		node2.setleft(node4);
		node2.setrigth(node5);
		node5.setleft(node7);;
		root.setrigth(node3);
		node3.setrigth(node6);
		
		tree.setCurrent(tree.getRoot() );
		System.out.println( " menampilkan simpul terkahir :");
		System.out.println( tree.getCurrent().getData());
		System.out.println(" jumlha simpul setelah simpul 7 ditambahkan");
		System.out.println(tree.countNodes());
		System.out.println( " Inorder :");
		tree.prinInorder();
		System.out.println("\nPreorder :");
		tree.printPreorder ()
;
		System.out.println("\nPostorder");
		tree.printPostorder () ;
		System.out.println(" \n menampilkan simpul dalam bentuk pohon");
		tree.print () ;
	}

}
