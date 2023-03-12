package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		// create an integer array with 10 elements
		//int arr[] = {15,32,3,54,75,36,17,98,69,100};
		
		//call the bubblesort method
		//Sort s1 = new Sort();
		//s1.bubbleSort(arr);
		
		//System.out.println("Sorted array : ");
		//for(int i=0;i<10;i++) {
			//System.out.println(arr[i]+" ");
		
		
		Float arr1[]= {45f,5f,67f,345f,642f};
		Double arr2[]= {34.2,56.0,5.90,45.7,1.1};
		
		SortGeneric<Float> s1 = new SortGeneric<>();
		s1.add(arr1);
		s1.bubbleSort(null);
		s1.printArray();
		
		SortGeneric<Double> s2 = new SortGeneric<>();
		s2.add(arr2);
		s2.bubbleSort(null);
		s2.printArray();
		
		}
	}

