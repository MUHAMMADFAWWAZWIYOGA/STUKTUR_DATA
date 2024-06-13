package pekan1;

public class pekan1_1 {
	
	public class Main {
	    public void main(String[] args) {
	      
	        int[] angka = {3, 5, 7, 9, 11};

	        System.out.println("Elemen array:");
	        for (int i = 0; i < angka.length; i++) {
	            System.out.println("Elemen ke-" + i + ": " + angka[i]);
	        }

	        
	        angka[2] = 17;

	        
	        System.out.println("\nElemen array setelah diubah:");
	        for (int i = 0; i < angka.length; i++) {
	            System.out.println("Elemen ke-" + i + ": " + angka[i]);
	        }
	    }
	}

}
