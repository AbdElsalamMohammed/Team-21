import java.util.*;
import java.io.*;

public class Main {
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
                most_rep();
            } else if (choice == 2) {
                sort();
            } else if (choice == 3) {
                // Shuffle
                shuffle();
            } else if (choice == 4) {
                // Find the largest prime
            } else if (choice == 5) {
                smallest_prime();
            } else if (choice == 6) {
                // Check palindrome
            } else if (choice == 7) {
                // Check sorted
            } else if (choice == 8) {
                // Count primes
                Count_Prime();
            } else if (choice == 9) {
                // Reverse array
                reverseArray();
            } else if (choice == 10) {
                // Shift array
                System.out.println("The sifted array is : " + shift_array());
            } else if (choice == 11) {
                // Distinct array
                ArrayList<Integer> dis=new ArrayList<Integer>();
				        System.out.println(" enter array size   ");
				        int num = 0;
				        Scanner s = new Scanner(System.in);
				        num = s.nextInt();
				        System.out.println("Enter all the elements:");
				        for (int i = 0; i < num; i++) {
			        		dis.add(s.nextInt());
			      		  Distinct(dis);}
            } else if (choice == 12) {
                Maxthreenumber();
            } else if (choice == 13) {
                // Get the minimum 3 numbers
                getThreeMinNums();
            } else if (choice == 14) {
                // Get average
            } else if (choice == 15) {
                // Get median
                int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
      				  System.out.println("Median = " + getMedian(a)); 

            } else if (choice == 16) {
                // Return only primes
            } else if (choice == 17) {
                // Zero if less than zero
            } else if (choice == 18) {
                // Execute all functions
                execute_all();
            } else {
                break; // exit
            }
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
        System.out.println("    --Get Three Minimum numbers--    ");
        getThreeMinNums();

        System.out.println("The maxmam 3 number in array ");

        Maxthreenumber();
        System.out.println("");
        System.out.println("The Smallest Prime in array ");
        smallest_prime();
        System.out.println("");

        Maxthreenumber();
        System.out.println("Most_repeated func");
        most_rep();
        System.out.println("--shuffle array function--");
        shuffle();

        System.out.println("    --reverse array Function--    ");
        reverseArray();


		System.out.println("    --Count prime number Function--    ");
		Count_Prime();
		System.out.println();


		System.out.println("..........fun CheckSort..........");
		CheckSort();
		System.out.println("    --Get Three Minimum numbers--    ");
		getThreeMinNums ();
		
		
		System.out.println("The maxmam 3 number in array ");

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
        System.out.println();
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
        for (int i = 0; i < input.length; i++) {
            arr.add(input[i] + "");
        }
        String shifted_arr = "";
        shifted_arr += arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            shifted_arr += arr.get(i);
        }
        return shifted_arr;
    }
//--------------------------------------------count prime number

    public static void Count_Prime() {
        int size = 0, counter = 0, max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size : ");
        size = input.nextInt();
        int Array[] = new int[size];
        System.out.println("Please enter array " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 2; j < max; j++) {
                if (Array[i] == 1) {
                    break;
                } else if (Array[i] % j == 0 && Array[i] != j) {
                    break;
                } else if (j == max - 1) {
                    counter++;
                }
            }
        }
        System.out.println("Prime number = " + counter);
    }

    /*Get Three Minimum Numbers */
    public static void getThreeMinNums() {
        ArrayList<Integer> array = new ArrayList<>();
        int size = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The size of the array ! ");
        size = sc.nextInt();
        System.out.println("Enter your Array ! ");
        for (int i = 0; i < size; i++) {
            array.add(sc.nextInt());
        }

        Collections.sort(array);
        for (int j = 0; j < 3 && j < size; j++) {
            System.out.print(array.get(j) + "  ");
        }
        System.out.println();

    }

	
	public static void CheckSort() {
		boolean flag = false ; 
		int size=0 , element =0 ;
		System.out.println("Please enter the size of your array ^_^ ");
		Scanner input = new Scanner (System.in);
		size=input.nextInt();
		int arr[] = new int [size];
		System.out.println("Please enter the " + size + " element of your array ^_^ ");
		for(int i=0 ; i<size ; i++)
		{   element =input.nextInt();
			arr[i]= element ; }
		
		for(int i = 0; i < arr.length-1; i ++)
		{  if (arr[i] < arr[i+1]) 
	            flag= true;
	       else 
	        	{flag= false; break;}
		}
		
		if (flag==true)
			System.out.println(flag + "...the array is sorted ");
		else 
			System.out.println(flag + "...the array isn't sorted ");	
		
	}

//-------------------------------------------maxmam 3 number
    public static void Maxthreenumber() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int num = 0;
        System.out.print("Enter numbers of elements you want in array:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while (num < 3) {
            System.out.println("Numbers should be atleat 3 number ");
            System.out.println("Enter how many number you will Enter ?");
            num = input.nextInt();
        }
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) {
            numbers.add(input.nextInt());
        }
        Collections.sort(numbers);
        System.out.println("The lasrgest 3 number in arr are " + numbers.get(numbers.size() - 1) + "  " + numbers.get(numbers.size() - 2) + "  " + numbers.get(numbers.size() - 3));
    }
//------------------------------------------------------ Smallest prime 

 public static void smallest_prime () 
   {
    ArrayList<Integer> Arr = new ArrayList();
    ArrayList<Integer> Prim_Arr = new ArrayList();
    Scanner input = new Scanner(System.in);
    int x;
    int temp;
    boolean prime;
    System.out.println("Enter Your Array size : ");
      Scanner sizee = new Scanner(System.in);
      int size ;
      size=sizee.nextInt();    
     System.out.println("Enter Your Array : ");
    for (int i = 0; i < size; i++) 
        {
            x = input.nextInt();
            Arr.add(x);
        }
        for (int i = 0; i < Arr.size(); i++) {
            prime = true;
            if (Arr.get(i) == 2) {
                Prim_Arr.add(Arr.get(i));
                continue;
            }

            for (int j = 2; j < Arr.get(i); j++) {
                if (Arr.get(i) % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                Prim_Arr.add(Arr.get(i));
            }
        }
        int min;
        min = Prim_Arr.get(0);
        for (int i = 0; i < Prim_Arr.size(); i++) {
            if (min > Prim_Arr.get(i)) {
                min = Prim_Arr.get(i);
            }
        }
        System.out.println("Mini Prime: " + min);
    }

    public static class char_data {

        String symbol = "";
        int counter = 0;
    }

    public static int search(String c, Vector<char_data> V) {

        for (int j = 0; j < V.size(); j++) {
            if (c.equals(V.get(j).symbol)) {
                return j;
            }
        }
        return -1;
    }

    public static void most_rep() {
        Vector<char_data> Vec = new Vector<char_data>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your text");
        String input = read.nextLine();
        for (int i = 0; i < input.length(); i++) { //System.out.println(i);
            String temp = "";
            temp = "" + input.charAt(i);
            int s = search(temp, Vec);
            if (s == -1) {
                char_data n = new char_data();
                n.symbol = "" + input.charAt(i);
                n.counter = 1;
                Vec.addElement(n);
            } else {
                Vec.get(s).counter = (Vec.get(s).counter + 1);
            }
        }

        char_data most = new char_data();
        if (Vec.size() != 0) {
            most.symbol = Vec.get(0).symbol;
            most.counter = Vec.get(0).counter;
        }
        for (int t = 0; t < Vec.size(); t++) {
            if (Vec.get(t).counter > most.counter) {
                most.symbol = Vec.get(t).symbol;
                most.counter = Vec.get(t).counter;
            }

        }

        if (Vec.size() != 0) {
            System.out.println("most repeated value: " + most.symbol);
        }

    }

    /**
     * shuffle
     */
    public static void shuffle() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] integerStrings = s.split(" ");
        int[] array = new int[integerStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(integerStrings[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        Collections.shuffle(list);
        //print shuffled array
        System.out.print("shuffled array: ");
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }//end of shuffle

    /**
     * ********************* reverse array *****************
     */
    public static void reverseArray() {

        System.out.print("enter array size that you want to reverse it : ");
        Scanner s = new Scanner(System.in);

        try {
            int arraySize = s.nextInt();
            int[] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.print("enter value in index " + (i) + " : ");
                array[i] = s.nextInt();
            }

            System.out.println("array before rerversing");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + "\t");
            }

            // reversing array
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }

            System.out.println("\narray after rerversing");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + "\t");
            }
        } catch (Exception e) {
            System.out.println("sorry you have enter incorrect inputs.\n" + "hint:enter Integer values.\n");

            //System.out.println(e.getMessage());
            reverseArray();
            System.out.println();
        }

    }


//-------Zero if less than Zero--------
public static void ZeroIfLessThanZero()
{
	int arr[];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = scanner.nextInt();
		arr = new int[size];
		System.out.print("Enter the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			if(arr[i]<0)
			{
				arr[i]+= -1*arr[i];
			}
		} 
		System.out.print("The new array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
  }//--------End of Zero if less than Zero-----------

	public static ArrayList<Integer> Distinct(ArrayList<Integer> arr1)
	{
		int n=arr1.size();
		ArrayList<Integer> Result=new ArrayList<Integer>();
		boolean Noprint=false;
		for(int i=0;i<n;i++)
		{
			int j;
			if(i==0)
			{
				Result.add(arr1.get(i));
			}
			for(j=0; j<i ;j++)
			{
				if(arr1.get(i)==arr1.get(j))
					break;
				if(j+1==i)
					Noprint=true;
			}
			if(Noprint==true)
			{
				Result.add(arr1.get(i));
			}
			Noprint=false;
		}
		ArrayList<Integer> arr2=Result;
		System.out.println(arr2);
		
		return arr2;
	}

    public static double getMedian(int a[]) 
    { 
        // First we sort the array
        int n=a.length; 
        Arrays.sort(a); 
  
        // check for even case 
        if (n % 2 != 0) 
        return (double)a[n / 2]; 
      
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
    }
    	public static void Return_only_primes() {
    Scanner reader = new Scanner(System.in);
		ArrayList <Integer>Array = new ArrayList<>();
		ArrayList <Integer>primes = new ArrayList<>();
		System.out.println("Enter numbers ");
		String Input =reader.nextLine();
		String[]word= Input.split(",");
		for(int i = 0; i< word.length ; i++)
		{
	    Array.add(Integer.parseInt(word[i]));
		}
		
		boolean p ;
		for (int i =0 ; i< Array.size(); i++)
		{
			p = true;
			int half = Array.get(i)/2 ;
			for(int j = 2;  j < Array.get(i) ;j++)
			{
				if (Array.get(i)%j==0)
				{
					p = false ;
					break;
				}
			}
			if (p==true&&Array.get(i)!=0)
				{
				primes.add(Array.get(i));
				}
		}
	
		System.out.println("the prime numbers are: ");
		for(int i = 0 ; i<primes.size(); i++ )
		{
			System.out.print(primes.get(i)+" ");
		}
        }

      
}//end of class main

