package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = {"Integer", "Number", "Value", "Void", "Public"};
		//2. print the third element in the array
		System.out.println(words[2]);
		//3. set the third element to a different value
		words[3] = "Absolute Value";
		//4. print the third element again
		System.out.println(words[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		//6. make an array of 50 integers
		int[] array = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			
			int random = ran.nextInt(51);
			array[i] = random;
		}

		//8. without printing the entire array, print only the smallest number in the array
		int number = array[0];
		for (int i = 1; i < array.length; i++) {
			
			if (number > array[i]) {
				number = array[i];
			}
			


		}
		System.out.println(number);
	
		//9 print the entire array to see if step 8 was correct
		//10. print the largest number in the array.
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			
			if (largest < array[i]) {
				largest = array[i];
			}
			

	}
		System.out.println(largest);}}

