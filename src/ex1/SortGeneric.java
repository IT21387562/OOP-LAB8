package ex1;

public class SortGeneric<T extends Number> {
	T t[];
	
	public void add(T val[]) {
		this.t = val;
	}
	
	public T[] get() {
		return t;
	}
	
	/* public void bubbleSort(int arr[])
	 {
		 
		 	for (int i = 0; i < t.length -1; i++)
		 		for (int j = 0; j < t.length -i -1; j++)
		 			if (t[j].doubleValue() > t[j+1].doubleValue())
		 			{
		 				// swap t[j+1] and t[i]
		 				T temp = t[j];
		 				t[j] = t[j+1];
		 				t[j+1] = temp;
		 			}
	 } */
	
	
	 
	 public void printArray() {
		 for(int i =0;i<t.length;i++) {
			 System.out.println(t[i]+" ");
		 }
		 System.out.println();
	 }

}
