package pekan2;

	
	public class ArrayStack<E> implements Stack2<E> {
		public static final int CAPACITY = 1000;
		//default array capacity
		private E[] data; //generic array used for storage
		private int t = -1;
		
		public ArrayStack() {
			this(CAPACITY);
		}//construct stack with default capacity
		
		public ArrayStack(int capacity) {
			//construct stack with given capacity
			data = (E[]) new Object[capacity];
		}
		
		public int size() {
			return (t + 1);
		}
		
		public boolean isEmpty() {
			return (t == -1);
		}
		
		public void push(E e) throws IllegalStateException{
			if(size() == data.length)
				throw new IllegalStateException("Stack Is Full");
			data[++t] = e;
			//increment e before starting new item
		}
		
		public E top() {
			if(isEmpty()) {
				return null;
			}
			return data[t];
		}
		
		public E pop() {
			if(isEmpty())
				return null;
			E answer = data[t];
			data[t] = null;
			t--;
			return answer;
		}
		
	}


