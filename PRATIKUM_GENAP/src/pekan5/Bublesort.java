package pekan5;

public class Bublesort {

	public static void BubbleSort ( int [] arr) {
		int n = arr.length ;
		for ( int i = 0 ; i < n ; i ++) {
			for ( int j = 0 ; j < n - i - 1 ; j++) {
				
				if ( arr [j] > arr[j+1]) {
					int temp = arr [j];
					arr [j] = arr [j + 1];
					arr [j + 1 ] = temp;
				}
			}
		}
	}

public static void main (String [] args ) {
		
		int arr [] = { 23, 78, 45 , 8, 32, 56, 1 };
		int n = arr.length ;
		System.out.printf(" array yang belum terurut:\n");
		
		for ( int i = 0 ; i < n ; i++)
			System.out.print( arr [i] + " ");
		
		System.out.println("");
		
		
		BubbleSort (arr);
		System.out.printf( " array yang sh berurut:\n");
		for ( int i = 0 ; i <n ; i++)
			System.out.print( arr [i] + " ");
		
		System.out.println("");
}
		
		}
	
	
