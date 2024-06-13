package pekan2;

public class contohStack {

	public static void main(String[] args) {
	ArrayStack stak = new ArrayStack();
	Integer[] a = {4, 8, 15, 16, 23, 42	};
	for (int i = 0; i < a.length; i++) {
		System.out.println("nilai A " + i + " = " + a[i]);
		stak.push(a[i]);
		
	}
	System.out.println("Size stacknya = " +stak.size());
	System.out.println("Paling atas = " + stak.top());
	System.out.println("Nilainya = " + stak.pop());
	}
}

