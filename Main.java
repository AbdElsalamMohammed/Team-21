import java.util.*;
import java.io.*;

public class SortArray {

	public static void main(String[] args) {
		int choice = 0;
		while (true) {
			System.out.println(" 1- Most repeated value");
			System.out.println(" 2- Sort");
			System.out.println(" 3- Shuffle");
			System.out.println(" 4- Find the largest prime");
			System.out.println(" 5- Find the smallest prime");
			System.out.println(" 6- Check palindrome");
			System.out.println(" 7- Check sorted");
			System.out.println(" 8- Count primes");
			System.out.println(" 9- Reverse array");
			System.out.println("10- Shift array");
			System.out.println("11- Distinct array");
			System.out.println("12- Get the maximum 3 numbers");
			System.out.println("13- Get the minimum 3 numbers");
			System.out.println("14- Get average");
			System.out.println("15- Get median");
			System.out.println("16- Return only primes");
			System.out.println("17- Zero if less than zero");
			System.out.println("18- Execute all functions");
			System.out.println("19- Exit");
			System.out.println("Please enter your choice ... ");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				choice = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println(e);
			}
			if (choice == 1) {
				// Most repeated value
			} else if (choice == 2) {
				sort();
			} else if (choice == 3) {
				// Shuffle
			} else if (choice == 4) {
				// Find the largest prime
			} else if (choice == 5) {
				// Find the smallest prime
			} else if (choice == 6) {
				// Check palindrome
			} else if (choice == 7) {
				// Check sorted
			} else if (choice == 8) {
				// Count primes
				Count_Prime();
			} else if (choice == 9) {
				// Reverse array
			} else if (choice == 10) {
				// Shift array
				System.out.println("The sifted array is : " + shift_array());
			} else if (choice == 11) {
				// Distinct array
			} else if (choice == 12) {
				// Get the maximum 3 numbers
			} else if (choice == 13) {
				// Get the minimum 3 numbers
			} else if (choice == 14) {
				// Get average
			} else if (choice == 15) {
				// Get median
			} else if (choice == 16) {
				// Return only primes
			} else if (choice == 17) {
				// Zero if less than zero
			} else if (choice == 18) {
				// Execute all functions
				execute_all();
			} else
				break; // exit
			System.out.println("===========================================");
		}
	}

	public static void execute_all() {
		System.out.println("    --Shift array Function--    ");
		System.out.println("The sifted array is : " + shift_array());
		System.out.println("    --Sort array Function--    ");
		System.out.print("The Sorted  array is : ");
		sort();
		System.out.println("");
	}

	public static void sort() {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num = 0;
		System.out.print("Enter no. of elements you want in array:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Enter all the elements:");
		for (int i = 0; i < num; i++) {
			arr.add(s.nextInt());
		}

		Collections.sort(arr);

		for (int counter : arr) {
			System.out.print(counter + " ");
		}
	}

	public static String shift_array() {
		String s = "";
		try {
			System.out.println("Please enter the array ... ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s = br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		char[] input = s.toCharArray();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < input.length; i++)
			arr.add(input[i] + "");
		String shifted_arr = "";
		shifted_arr += arr.get(arr.size() - 1);
		for (int i = 0; i < arr.size() - 1; i++)
			shifted_arr += arr.get(i);
		return shifted_arr;
	}
//--------------------------------------------count prime number
	public static void Count_Prime () {
		int size=0,counter=0,max=0;
    	Scanner input = new Scanner (System.in);
    	System.out.println("Please enter array size : ");
    	size = input.nextInt();
    	int Array[]= new int[size];
    	System.out.println("Please enter array "+size+" elements : ");
    	for(int i=0;i<size;i++) {
    		Array[i]=input.nextInt();
    	}
		for(int i=0;i<Array.length;i++) {
			if(max<Array[i])
				max=Array[i];
		}
		for(int i=0;i<Array.length;i++) {
			for(int j=2;j<max;j++) {
				if(Array[i]==1)
					break;
				else if(Array[i]%j==0 && Array[i]!=j)
					break;
				else if(j==max-1) {
					counter++;
				}
			}
		}
		System.out.println("Prime number = "+counter);
	}
//-------------------------------------------maxmam 3 number 
	public static void Maxthreenumber(){ 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int num = 0;
		System.out.print("Enter numbers of elements you want in array:");
		Scanner input= new Scanner(System.in);
		num = input.nextInt();
		while(num<3)
		{
			System.out.println("Numbers should be atleat 3 number ");
			System.out.println("Enter how many number you will Enter ?");
			num= input.nextInt();
		}
		System.out.println("Enter all the elements:");
		for (int i = 0; i < num; i++) {
			numbers.add(input.nextInt());
		}
		Collections.sort(numbers);
		System.out.println("The lasrgest 3 number in arr are "+ numbers.get(numbers.size()-1) +"  "+ numbers.get(numbers.size()-2) +"  "+ numbers.get(numbers.size()-3));
		}

		
		
		
		
		
	
	
	
	
}
