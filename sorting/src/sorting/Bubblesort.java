package sorting;
import java.util.Scanner;

class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter intergers on one line:");
		String input = keyboard.nextLine().trim();
		String[] numbers = input.split(" +");
		int Sortarray[] = new int[numbers.length];
		for (int k = 0; k < numbers.length; k++){
			Sortarray[k] = Integer.parseInt(numbers[k]);
	
			
		}
		// int[] Sortarray = new int[]{3,7,6,1,9};
		Bubblesorting(Sortarray);
		for (int i =0;i<Sortarray.length;i++){
			System.out.println(Sortarray[i]);
		
		}
		

	}
	
	 static void Bubblesorting(int[] Myarray){
		 int temp;
		 for (int i = 0; i < Myarray.length-1; i++){
			 for (int j = 0; j < Myarray.length - i-1; j++){
				 if (Myarray[j] > Myarray[j+1]){
					 temp = Myarray[j];
					 Myarray[j] = Myarray[j+1];
					 Myarray[j+1] = temp;
					
				 }
			 }
		 }
		
		
	}

}
